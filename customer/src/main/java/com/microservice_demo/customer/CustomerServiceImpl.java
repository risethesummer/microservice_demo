package com.microservice_demo.customer;

import com.linkho.clients.fraud.FraudCheckResponse;
import com.linkho.clients.fraud.FraudClient;
import com.linkho.clients.notification.NotificationClient;
import com.linkho.clients.notification.NotificationRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private final NotificationClient notificationClient;
    private final FraudClient fraudClient;
    @Override
    public void registerCustomer(CustomerRegistrationRequest customerRequest) {
        Customer customer = Customer.builder()
                .firstName(customerRequest.firstName())
                .lastName(customerRequest.lastName())
                .email(customerRequest.email())
                .build();
        //Check if fraudster
        customerRepository.saveAndFlush(customer);
        FraudCheckResponse fraudCheckRes = fraudClient.checkFraudster(customer.getId());
        assert fraudCheckRes != null;
        if (fraudCheckRes.isFraudster())
            throw new IllegalStateException("fraudster");

        notificationClient.sendNotification(new NotificationRequest(
                customer.getId(),
                customer.getEmail(),
                String.format("Hi %s, welcome to Amigoscode...",
                        customer.getFirstName())
        ));
    }
}

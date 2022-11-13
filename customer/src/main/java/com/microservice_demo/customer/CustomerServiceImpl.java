package com.microservice_demo.customer;

import com.linkho.clients.fraud.FraudCheckResponse;
import com.linkho.clients.fraud.FraudClient;
import com.linkho.notification.NotificationRequest;
import lombok.AllArgsConstructor;
import org.linkho.amqp.RabbitMQMessageProducer;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private final FraudClient fraudClient;
    private final RabbitMQMessageProducer rabbitMQMessageProducer;
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

        NotificationRequest notificationRequest = new NotificationRequest(
                customer.getId(),
                customer.getEmail(),
                String.format("Hi %s, welcome to Amigoscode...",
                        customer.getFirstName())
        );

        rabbitMQMessageProducer.publish(
                "internal.exchange",
                "internal.notification.routing-key",
                notificationRequest
        );
    }
}

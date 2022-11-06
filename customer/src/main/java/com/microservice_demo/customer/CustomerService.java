package com.microservice_demo.customer;

import org.springframework.stereotype.Service;

/**
 * com.microservice_demo.customer
 * Created by NhatLinh - 19127652
 * Date 11/6/2022 - 1:16 PM
 * Description: ...
 */
@Service
public interface CustomerService {
    void registerCustomer(CustomerRegistrationRequest customerRequest);
}



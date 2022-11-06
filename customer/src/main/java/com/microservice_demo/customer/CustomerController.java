package com.microservice_demo.customer;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * com.microservice_demo.customer
 * Created by NhatLinh - 19127652
 * Date 11/6/2022 - 1:12 PM
 * Description: ...
 */
@Slf4j
@RestController
@RequestMapping("api/v1/customers")
@AllArgsConstructor
public class CustomerController {

    private final CustomerService customerService;
    @PostMapping
    public void registerCustomer(@RequestBody CustomerRegistrationRequest customerRequest)
    {
        log.info("New customer registration: {}", customerRequest);
        customerService.registerCustomer(customerRequest);

    }
}

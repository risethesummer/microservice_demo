package com.microservice_demo.customer;

/**
 * com.microservice_demo.customer
 * Created by NhatLinh - 19127652
 * Date 11/6/2022 - 1:15 PM
 * Description: ...
 */
public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {
}

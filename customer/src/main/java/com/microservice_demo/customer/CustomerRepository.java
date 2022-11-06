package com.microservice_demo.customer;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * com.microservice_demo.customer
 * Created by NhatLinh - 19127652
 * Date 11/6/2022 - 1:52 PM
 * Description: ...
 */
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}

package com.microservice_demo.customer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * com.microservice_demo.customer
 * Created by NhatLinh - 19127652
 * Date 11/6/2022 - 1:11 PM
 * Description: ...
 */
@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    @SequenceGenerator(
            name = SequenceNames.CUSTOMER_ID,
            sequenceName = SequenceNames.CUSTOMER_ID
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = SequenceNames.CUSTOMER_ID
    )
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
}

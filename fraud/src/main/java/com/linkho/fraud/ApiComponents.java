package com.linkho.fraud;

/**
 * com.linkho.fraud
 * Created by NhatLinh - 19127652
 * Date 11/6/2022 - 2:47 PM
 * Description: ...
 */
public interface ApiComponents {
    String ROOT_PATH = "api/v1/";
    interface FraudCheck
    {
        String PATH = "api/v1/fraud-check";
        String CUSTOMER_ID_VARIABLE = "customerId";
    }
}

package com.linkho.clients.fraud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * com.linkho.clients.fraud
 * Created by NhatLinh - 19127652
 * Date 11/6/2022 - 8:21 PM
 * Description: ...
 */
@FeignClient("fraud")
public interface FraudClient {
    @GetMapping(path = "api/v1/fraud-check/{customerId}")
    FraudCheckResponse checkFraudster(
            @PathVariable("customerId") Integer customerId);
}
package com.linkho.fraud;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * com.linkho.fraud
 * Created by NhatLinh - 19127652
 * Date 11/6/2022 - 2:45 PM
 * Description: ...
 */
@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping(ApiComponents.FraudCheck.PATH)
public class FraudCheckController {

    private final FraudCheckService fraudCheckService;

    @GetMapping(path = "{" + ApiComponents.FraudCheck.CUSTOMER_ID_VARIABLE + "}")
    public FraudCheckResponse checkFraudster(
            @PathVariable(ApiComponents.FraudCheck.CUSTOMER_ID_VARIABLE) Integer customerId)
    {
        boolean isFraudulentCustomer = fraudCheckService.isFraudulentCustomer(customerId);
        log.info("fraud check request for customer {}", customerId);
        return new FraudCheckResponse(isFraudulentCustomer);
    }
}

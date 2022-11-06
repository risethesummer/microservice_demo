package com.linkho.fraud;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * com.linkho.fraud
 * Created by NhatLinh - 19127652
 * Date 11/6/2022 - 2:45 PM
 * Description: ...
 */
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
        return new FraudCheckResponse(isFraudulentCustomer);
    }
}

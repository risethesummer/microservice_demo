package com.linkho.fraud;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class FraudCheckServiceImpl implements FraudCheckService {

    private final FraudCheckRepository fraudCheckRepository;

    @Override
    public boolean isFraudulentCustomer(Integer customerId) {
        fraudCheckRepository.save(
          FraudCheckHistory.builder()
                  .customerId(customerId)
                  .isFraudster(false)
                  .createdAt(LocalDateTime.now())
                  .build()
        );
        return false;
    }
}

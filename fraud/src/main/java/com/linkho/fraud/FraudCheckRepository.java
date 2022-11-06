package com.linkho.fraud;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * com.linkho.fraud
 * Created by NhatLinh - 19127652
 * Date 11/6/2022 - 2:34 PM
 * Description: ...
 */
public interface FraudCheckRepository extends JpaRepository<FraudCheckHistory, Integer> {
}

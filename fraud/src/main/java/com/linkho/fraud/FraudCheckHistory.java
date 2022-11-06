package com.linkho.fraud;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * com.linkho.fraud
 * Created by NhatLinh - 19127652
 * Date 11/6/2022 - 2:14 PM
 * Description: ...
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class FraudCheckHistory {
    @Id
    @SequenceGenerator(
            name = SequenceNames.FRAUD_ID_SEQUENCE,
            sequenceName = SequenceNames.FRAUD_ID_SEQUENCE
    )
    @GeneratedValue (
            generator = SequenceNames.FRAUD_ID_SEQUENCE,
            strategy = GenerationType.SEQUENCE
    )
    private Integer id;
    private Integer customerId;
    private Boolean isFraudster;
    private LocalDateTime createdAt;
}
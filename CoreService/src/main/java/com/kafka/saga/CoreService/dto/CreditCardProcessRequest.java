package com.kafka.saga.CoreService.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;

import java.math.BigDecimal;
import java.math.BigInteger;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreditCardProcessRequest {
    @NotNull
    @Positive
    private BigInteger creditCardNumber;
    @NotNull
    @Positive
    private BigDecimal paymentAmount;

}

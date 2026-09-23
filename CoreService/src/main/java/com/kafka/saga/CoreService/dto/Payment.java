package com.kafka.saga.CoreService.dto;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private Long id;
    private Long orderId;
    private Long productId;
    private BigDecimal productPrice;
    private Integer productQuantity;


}


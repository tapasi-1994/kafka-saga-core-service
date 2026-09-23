package com.kafka.saga.CoreService.dto.commands;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProcessPaymentCommand {

    private Long productId;
    private Integer productQuantity;
    private Long orderId;
    private BigDecimal price;
}

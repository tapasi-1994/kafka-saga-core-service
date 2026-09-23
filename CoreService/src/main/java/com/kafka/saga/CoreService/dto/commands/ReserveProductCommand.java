package com.kafka.saga.CoreService.dto.commands;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReserveProductCommand {
    private Long productId;
    private Integer productQuantity;
    private Long orderId;
}

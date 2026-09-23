package com.kafka.saga.CoreService.events;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductReservedEvent {
    private Long orderId;
    private Long productId;
    private BigDecimal productPrice;
    private Integer productQuantity;

}

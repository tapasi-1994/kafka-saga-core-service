package com.kafka.saga.CoreService.events;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderCreatedEvent {
    private Long orderId;
    private String customerId;
    private Long productId;
    private Integer productQuantity;


}

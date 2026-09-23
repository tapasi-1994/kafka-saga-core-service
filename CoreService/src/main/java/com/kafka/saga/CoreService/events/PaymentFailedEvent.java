package com.kafka.saga.CoreService.events;

import lombok.*;



@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PaymentFailedEvent {
    private Long orderId;
    private Long productId;
    private Integer productQuantity;


}

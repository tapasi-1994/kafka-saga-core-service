package com.kafka.saga.CoreService.events;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductReservationFailedEvent {
    private Long productId;
    private Long orderId;
    private Integer productQuantity;

}

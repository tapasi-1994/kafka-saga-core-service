package com.kafka.saga.CoreService.events;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductReservationCancelledEvent {
    private Long productId;
    private Long orderId;
}

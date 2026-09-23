package com.kafka.saga.CoreService.events;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class PaymentProcessedEvent {
    private Long orderId;
    private Long paymentId;


}

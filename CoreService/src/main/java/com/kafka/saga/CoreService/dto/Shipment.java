package com.kafka.saga.CoreService.dto;

import lombok.*;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Shipment {
    private Long id;
    private Long orderId;
    private Long paymentId;

}

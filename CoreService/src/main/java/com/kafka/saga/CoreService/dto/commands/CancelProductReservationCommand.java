package com.kafka.saga.CoreService.dto.commands;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CancelProductReservationCommand {
    private Long productId;
    private Integer productQuantity;
    private Long orderId;
}

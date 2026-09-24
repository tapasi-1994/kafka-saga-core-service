package com.kafka.saga.CoreService.dto.commands;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RejectOrderCommand {
    private Long orderId;
}

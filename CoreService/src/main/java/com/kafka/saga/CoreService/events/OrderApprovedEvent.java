package com.kafka.saga.CoreService.events;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderApprovedEvent {
    private Long orderId;

}

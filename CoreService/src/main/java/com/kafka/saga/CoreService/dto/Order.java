package com.kafka.saga.CoreService.dto;




import com.kafka.saga.CoreService.types.OrderStatus;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Long orderId;
    private String customerId;
    private Long productId;
    private Integer productQuantity;
    private OrderStatus status;

}

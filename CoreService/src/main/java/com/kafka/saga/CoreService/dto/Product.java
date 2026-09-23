package com.kafka.saga.CoreService.dto;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Long productId;
    private String name;
    private BigDecimal price;
    private Integer quantity;
}
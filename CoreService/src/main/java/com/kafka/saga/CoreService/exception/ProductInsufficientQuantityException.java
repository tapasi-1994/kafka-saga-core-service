package com.kafka.saga.CoreService.exception;

import lombok.Getter;

@Getter

public class ProductInsufficientQuantityException extends RuntimeException {
    private final Long productId;
    private final Long orderId;

    public ProductInsufficientQuantityException(Long productId, Long orderId) {
        super("Product " + productId + " has insufficient quantity in the stock for order " + orderId);
        this.productId = productId;
        this.orderId = orderId;
    }
}

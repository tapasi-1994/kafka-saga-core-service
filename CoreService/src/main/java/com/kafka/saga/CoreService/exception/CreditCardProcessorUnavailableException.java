package com.kafka.saga.CoreService.exception;

import lombok.Getter;

@Getter
public class CreditCardProcessorUnavailableException extends RuntimeException {

    public CreditCardProcessorUnavailableException(String message ,Throwable cause) {

        super(message, cause);
    }
}

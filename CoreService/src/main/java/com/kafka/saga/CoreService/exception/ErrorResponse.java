package com.kafka.saga.CoreService.exception;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class ErrorResponse {
    private String code;
    private String message;

}
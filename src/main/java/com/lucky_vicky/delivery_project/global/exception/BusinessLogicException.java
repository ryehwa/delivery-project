package com.lucky_vicky.delivery_project.global.exception;

import lombok.Getter;

@Getter
public class BusinessLogicException extends RuntimeException{
    private ExceptionCode exceptionCode;

    public BusinessLogicException(ExceptionCode exceptionCode) {
        super(exceptionCode.getMessage());
        this.exceptionCode = exceptionCode;
    }
}

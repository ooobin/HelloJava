package com.example.hellojava.base;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Global exception handler
 */
@RestControllerAdvice
public class ExHandler {

    /**
     * Handle all exceptions
     * @param ex exception
     * @return exception message
     */
    @ExceptionHandler(Exception.class)
    public Result<String> handleException(Exception ex) {
        ex.printStackTrace();
        ExStackHandler.logExStack(ex);
        return Result.failure(ex.toString());
    }
}

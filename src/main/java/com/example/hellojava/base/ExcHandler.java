package com.example.hellojava.base;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class ExcHandler {

    @ExceptionHandler(Exception.class)
    private static Result<String> handleException(Exception e) {
        // Log the exception
        logException(e);

        return Result.failure(e.toString());
    }

    private static void logException(Exception e) {
//        e.printStackTrace();

        // Log the exception message and stack trace
        log.error("An exception occurred: ");
        log.error(ExceptionUtils.getMessage(e));
        log.error(ExceptionUtils.getStackTrace(e));
    }

}

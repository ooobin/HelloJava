package com.example.hellojava.base;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Global exception handler
 */
@Slf4j
@RestControllerAdvice
public class ExHandler {

    /**
     * Catch all exception
     * Print and log exception stack
     *
     * @param ex exception
     * @return exception message
     */
    @ExceptionHandler(Exception.class)
    public Result<String> handleException(Exception ex) {
        logExStack(ex);
        ex.printStackTrace();
        return Result.failure(ex.toString());
    }

    /**
     * Filter log
     *
     * @param ex exception
     */
    private void logExStack(Exception ex) {
        StackTraceElement[] stackTraceElements = ex.getStackTrace();
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElements) {
            String className = stackTraceElement.getClassName();
            // Filter out the specified package
            if (!className.startsWith("jdk.") && !className.startsWith("java.") &&
                    !className.startsWith("jakarta.") && !className.startsWith("org.") &&
                    !className.contains("$$")) {
                sb.append("    at ").append(stackTraceElement).append("\n");
            }
        }
        // Add color to the log
        String darkRedColorCode = "\033[38;5;88m";

        log.error(darkRedColorCode + "异常信息: {}", ex.toString());
        log.error(darkRedColorCode + "异常堆栈信息: \n{}", sb);
    }
}

package com.example.hellojava.base;

import lombok.extern.slf4j.Slf4j;

/**
 * Exception stack trace handler
 */
@Slf4j
class ExStackHandler {

    /**
     * Log the exception with filtered stack trace
     *
     * @param ex exception
     */
    static void logExStack(Exception ex) {
        // Get the stack trace
        StackTraceElement[] stackTraceElements = ex.getStackTrace();

        // Create a StringBuilder to store the filtered stack trace
        StringBuilder sb = new StringBuilder();

        // Iterate through the stack trace
        for (StackTraceElement stackTraceElement : stackTraceElements) {
            String className = stackTraceElement.getClassName();
            // If you want to filter out the stack trace of specific packages, you can add them here
            if (!className.startsWith("jdk.") && !className.startsWith("java.") &&
                    !className.startsWith("jakarta.") && !className.startsWith("org.") &&
                    !className.contains("$$")) {
                sb.append("    at ").append(stackTraceElement).append("\n");
            }
        }

        // ANSI escape code for red color
        String darkRedColorCode = "\033[38;5;88m";

        log.error(darkRedColorCode + "异常信息: {}", ex.toString());
        log.error(darkRedColorCode + "异常堆栈信息: \n{}", sb);
    }
}

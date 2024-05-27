package com.example.hellojava.base;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Result<T> {
    /**
     * Whether the request is successful
     */
    private boolean success;

    /**
     * Error message
     */
    private String message;

    /**
     * Successful data
     */
    private T data;

    // Create successful result
    public static <T> Result<T> success(T data) {
        return new Result<>(true, null, data);
    }

    // Create failed result
    public static <T> Result<T> failure(String message) {
        return new Result<>(false, message, null);
    }
}

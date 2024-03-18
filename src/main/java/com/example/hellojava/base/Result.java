package com.example.hellojava.base;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Unified result to return
 * @param <T> data type
 */
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
     * Success data
     */
    private T data;

    // Static method, create successful result
    public static <T> Result<T> success(T data) {
        return new Result<>(true, null, data);
    }

    // Static method, create failed result
    public static <T> Result<T> failure(String message) {
        return new Result<>(false, message, null);
    }
}

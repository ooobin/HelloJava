package com.example.hellojava.model;

import lombok.Data;

/**
 * Data Transfer Object
 */
@Data
public class UserDTO {
    /**
     * username
     */
    private String username;

    /**
     * password
     */
    private String password;
}

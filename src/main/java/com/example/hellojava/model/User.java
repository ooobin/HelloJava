package com.example.hellojava.model;

import lombok.Data;

/**
 * User information
 */
@Data
public class User {

    /**
     * id
     */
    private Integer id;

    /**
     * guid
     */
    private String guid;

    /**
     * username
     */
    private String username;

    /**
     * password
     */
    private String password;

}
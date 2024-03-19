package com.example.hellojava.model.user;

import lombok.Data;

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
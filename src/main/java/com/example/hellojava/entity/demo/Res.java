package com.example.hellojava.entity.demo;

import lombok.Data;

@Data
public class Res {

    private int id;
    private String name;
    private String username;
    private String email;
    private Company company;

    @Data
    private static class Company {
        private String name;
        private String catchPhrase;
        private String bs;
    }
}

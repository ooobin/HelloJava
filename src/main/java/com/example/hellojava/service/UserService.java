package com.example.hellojava.service;

import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;

public interface UserService {

    /**
     * Get all users' info
     *
     * @return users list
     */
    HashMap<Object, Object> getAll();

    /**
     * Single file upload
     *
     * @param file file
     */
    void uploadFile(MultipartFile file);

}

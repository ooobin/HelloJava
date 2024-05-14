package com.example.hellojava.service;

import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;

public interface UserService {

    /**
     * Find all users info
     *
     * @return List<User>
     */
    HashMap<Object, Object> findAll();

    /**
     * Single file upload
     *
     * @param file file
     */
    void uploadFile(MultipartFile file);

}

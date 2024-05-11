package com.example.hellojava.service;

import com.google.gson.JsonObject;
import org.springframework.web.multipart.MultipartFile;

public interface UserService {

    /**
     * Find all users info
     *
     * @return List<User>
     */
    JsonObject findAll();

    /**
     * Single file upload
     *
     * @param file file
     */
    void uploadFile(MultipartFile file);

}

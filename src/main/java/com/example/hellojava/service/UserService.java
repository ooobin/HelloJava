package com.example.hellojava.service;

import com.example.hellojava.model.User;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface UserService {

    /**
     * Get user information
     *
     * @return user object
     */
    List<User> findAll();

    /**
     * Single file upload
     *
     * @param file file
     */
    void uploadFile(MultipartFile file);

}

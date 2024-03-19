package com.example.hellojava.service;

import com.example.hellojava.model.user.User;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface UserService {

    /**
     * Find all users info
     *
     * @return List<User>
     */
    List<User> findAll();

    /**
     * Single file upload
     *
     * @param file file
     */
    void uploadFile(MultipartFile file);

}

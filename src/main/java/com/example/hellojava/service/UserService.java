package com.example.hellojava.service;

import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.web.multipart.MultipartFile;

public interface UserService {

    /**
     * Find all users info
     *
     * @return List<User>
     */
    ObjectNode findAll();

    /**
     * Single file upload
     *
     * @param file file
     */
    void uploadFile(MultipartFile file);

}

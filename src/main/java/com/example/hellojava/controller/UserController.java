package com.example.hellojava.controller;

import com.example.hellojava.base.Result;
import com.example.hellojava.model.User;
import com.example.hellojava.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * User information controller
 */
@Slf4j
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * Get user information
     *
     * @return user object
     */
    @PostMapping("/find-all")
    public Result<Object> findAll() {
        List<User> all = userService.findAll();
        return Result.success(all);
    }

    /**
     * Return Map data using LinkedHashMap
     */
    @PostMapping("/test-case")
    public Result<LinkedHashMap<Object, Object>> mapUse() {
        LinkedHashMap<Object, Object> map = new LinkedHashMap<>();
        map.put("name", "name");
        return Result.success(map);
    }

    /**
     * Single file upload
     *
     * @param file file
     * @return success data
     */
    @PostMapping("/upload-file")
    public Result<String> uploadFile(MultipartFile file) {
        userService.uploadFile(file);
        return Result.success("success");
    }

}
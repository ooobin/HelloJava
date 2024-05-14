package com.example.hellojava.controller;

import com.example.hellojava.base.Result;
import com.example.hellojava.service.UserService;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * Get and add user info and so on.
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
     * Find all user info
     *
     * @return List<User>
     */
    @GetMapping("/find-all")
    public Result<Object> findAll() {
        return Result.success(userService.findAll());
    }

    /**
     * Single file upload
     *
     * @param file file
     * @return "success"
     */
    @PostMapping("/upload-file")
    public Result<String> uploadFile(@NonNull MultipartFile file) {
        userService.uploadFile(file);
        return Result.success("success");
    }

}

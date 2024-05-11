package com.example.hellojava.service.impl;

import com.example.hellojava.mapper.UserMapper;
import com.example.hellojava.entity.user.User;
import com.example.hellojava.service.UserService;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Slf4j
@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public JsonObject findAll() {
        List<User> allUsers = userMapper.findAll();
        Gson gson = new Gson();
        String jsonString = gson.toJson(allUsers);
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        jsonObject.addProperty("status", 200);
        return jsonObject;
    }

    @Override
    public void uploadFile(MultipartFile file) {
        // 10MB 以下推荐使用 Base64
        // 大文件推荐静态资源映射

        // Save file to local
        String fileName = UUID.randomUUID().toString();
        String filePath = "/path/to/tomcat/webapps/myapp/images";
        File dest = new File(filePath + fileName);
        try {
            file.transferTo(dest);
        } catch (IOException e) {
            log.error("Upload file failed", e);
        }
    }

}
package com.example.hellojava.service.impl;

import com.example.hellojava.mapper.UserMapper;
import com.example.hellojava.model.user.User;
import com.example.hellojava.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

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
    public ObjectNode findAll() {
        List<User> allUsers = userMapper.findAll();
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode node = mapper.valueToTree(allUsers.get(0));
        node.put("key", "value");

        return node;
    }

    @Override
    public void uploadFile(MultipartFile file) {
        String filePath = "";
        String fileName = file.getOriginalFilename();
        String pathName = filePath + fileName;

        File newFile = new File(pathName);
        try {
            file.transferTo(newFile);
        } catch (IOException e) {
            log.error("Store file failed", e);
            throw new RuntimeException(e);
        }
    }

}
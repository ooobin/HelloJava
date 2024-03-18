package com.example.hellojava.mapper;

import com.example.hellojava.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    /**
     * Get user information
     *
     * @return user object
     */
    @Select("select * from users;")
    List<User> findAll();

}





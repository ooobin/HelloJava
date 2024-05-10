package com.example.hellojava.mapper;

import com.example.hellojava.entity.user.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    /**
     * Find all user info
     *
     * @return List<User>
     */
    @Select("select * from users;")
    List<User> findAll();

}





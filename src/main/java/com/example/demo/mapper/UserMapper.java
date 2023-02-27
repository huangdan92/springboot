package com.example.demo.mapper;


import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper //注释为Mapper
public interface UserMapper {
    User getUser(long uid);
}

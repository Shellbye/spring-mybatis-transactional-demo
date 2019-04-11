package com.example.demo.dao;

import com.example.demo.MyUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface MyUserMapper {

    void createMyUser(MyUser myUser);

}
package com.example.gradledemo.service;

import com.example.gradledemo.dao.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    public String findUsernameById(int id){
        //调用dao
        String UM = userMapper.getUsernameById(id);

        return UM;

    }
}

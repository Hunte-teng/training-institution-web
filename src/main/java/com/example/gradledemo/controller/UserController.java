package com.example.gradledemo.controller;

import com.example.gradledemo.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/")
    public String findUsernameById(){
        //调用userService
        String UM = userService.findUsernameById(10);
        System.out.println(UM);
        return null;

    }

}

package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by heiqie on 2017/9/30.
 */
@RestController
public class UserController {

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public User demo(){
        User user = new User();
        user.setName("test");
        user.setAge(11);
        return user;
    }
}

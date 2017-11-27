package com.study.first.user.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.study.first.user.entity.User;
import com.study.first.user.service.IUserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping(value = "/user/{id}")
    @ApiOperation(value = "获取用户对象")
    public User queryById(@PathVariable("id") String id){
        return  userService.selectById(id);
    }

    @GetMapping(value = "/users")
    @ApiOperation(value = "分页查询用户")
    public Page<User> listUser(){
        return userService.selectPage(new Page<User>(0,10));
    }

}

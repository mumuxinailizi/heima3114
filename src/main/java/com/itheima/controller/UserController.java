package com.itheima.controller;

import com.itheima.domain.User;
import com.itheima.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Copyright (C), 2018, 传智播客教育科技股份有限公司
 * FileName: UserController
 * Author:   黑马程序员
 * Description: 用户控制器
 */
@RequestMapping("/user")
@Controller
@ResponseBody
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/findAll.do")
    public List<User> findAll() {

        return userService.findAll();
    }
    @RequestMapping("/findById.do")
    public User findById(Integer id) {

        return userService.findById(id);
    }
    @RequestMapping("/update.do")
    public void update(@RequestBody User user) {

         userService.update(user);
    }
}

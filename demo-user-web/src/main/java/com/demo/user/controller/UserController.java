package com.demo.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.demo.pojo.TbUser;
import com.demo.user.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("/findList")
    public List<TbUser> findList() {
      return userService.findUserList();
    }

    @RequestMapping("/findUser")
    public TbUser findUser(String username){
        return userService.findUser(username);
    }

    @RequestMapping("/findUsersByAge")
    public List<TbUser> findUsersByAge(Integer start, Integer end){
        return userService.findUsersByAge(start,end);
    }
}

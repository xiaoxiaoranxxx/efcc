package com.xiao.demo666.controller;

import com.xiao.demo666.mapper.UsersMapper;
import com.xiao.demo666.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsersTrst {

    @Autowired
    private UsersMapper usersMapper;

    @GetMapping("/list")
    public List<Users> getlist(){
        List<Users> usersList =usersMapper.queryUserList();
//        for (Users users : usersList) {
//            System.out.println(users);
//        }
        return usersList;
    }

    @GetMapping("/id")
    public Users getbyid(){
       return usersMapper.queryUserById(1);
    }


}

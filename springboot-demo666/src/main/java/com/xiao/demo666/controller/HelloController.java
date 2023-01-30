package com.xiao.demo666.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/h")
    public String hello(){
        return "xi肖萧然";
    }
}

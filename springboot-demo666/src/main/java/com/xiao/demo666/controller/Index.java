package com.xiao.demo666.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Index {

    @RequestMapping("/test")
    public String test(Model model){
        model.addAttribute("msg","肖萧然最秀");
        return "test";
    }
}

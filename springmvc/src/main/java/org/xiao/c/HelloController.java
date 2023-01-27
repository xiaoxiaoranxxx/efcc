package org.xiao.c;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/h1")
    public String hello(Model model){
        model.addAttribute("msg","xsdjjhdshbjds牛");
        return "hello";
    }

    @RequestMapping("/h2")
    public String hello2(Model model){
        model.addAttribute("msg","12222222111");
        return "hello";
    }
    @RequestMapping("/add/{a}/{b}")
    public String add(@PathVariable int a,@PathVariable int b, Model model){
        model.addAttribute("msg","result"+a+b);
        return "hello";
    }

}

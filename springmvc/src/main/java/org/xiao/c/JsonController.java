package org.xiao.c;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.xiao.pojo.User;

import java.util.ArrayList;
import java.util.List;

@RestController
public class JsonController {

    @RequestMapping("/j1")
    public String json1() throws JsonProcessingException{
        User user =new User(1,"肖萧然","333333");
        return new ObjectMapper().writeValueAsString(user);
    }
    @RequestMapping("/j2")
    public String json2() throws JsonProcessingException{
        List<User> userList = new ArrayList<User>();

        User user1 =new User(1,"肖萧然","333333");
        User user2 =new User(1,"肖萧然","333333");
        User user3 =new User(1,"肖萧然","333333");
        User user4 =new User(1,"肖萧然","333333");

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

//        return new ObjectMapper().writeValueAsString(userList);
        return JSON.toJSONString(userList);
    }

}

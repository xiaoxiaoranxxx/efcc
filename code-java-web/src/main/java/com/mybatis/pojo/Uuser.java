package com.mybatis.pojo;


import lombok.Data;

@Data
public class Uuser {
    private int id;
    private String username;
    private String password;


    public int getxiao() {
        System.out.println("xiaoxiaoran");
        return 1;
    }
}

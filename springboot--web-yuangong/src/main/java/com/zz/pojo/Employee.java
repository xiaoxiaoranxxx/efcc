package com.zz.pojo;

//员工表

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor //有参构造
@NoArgsConstructor  //无参构造
public class Employee {
    private Integer id;
    private String lastName;
    private String email;
    private Integer gender;//0：女 1：男

    private Department department;
    private Date birth;

    public Employee(Integer id, String lastName, String email, Integer gender, Department department) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.department = department;
        //默认创建日期
        this.birth = new Date();
    }
}

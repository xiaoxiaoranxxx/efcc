package com.zz.dao;

import com.zz.pojo.Department;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//部门dao
@Repository
public class DepartmentDao {
    //模拟数据库中的数据
    private static Map<Integer, Department> departments = null;

    static {
        //创建一个部门表
        departments = new HashMap<Integer,Department>();
        departments.put(101,new Department(101,"前端"));
        departments.put(102,new Department(102,"后台"));
        departments.put(103,new Department(103,"测试"));
        departments.put(104,new Department(104,"运维"));
        departments.put(105,new Department(105,"项目经理"));
    }

    //获得所有部门信息
    public Collection<Department> getDepartments(){
        return departments.values();
    }

    //通过id得到部门
    public Department getDepartmentById(Integer id){
        return departments.get(id);
    }
}

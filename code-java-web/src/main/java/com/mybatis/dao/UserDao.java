package com.mybatis.dao;

import com.mybatis.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserDao {
    List<User> getUserList();
    User getUserById(int id);
    int addUser(User user);
    boolean updateUser(User user);
    int deleteUser(int id);
    List<User> getUserLimit(Map<String,Integer> map);

    @Select("select * from users")
    List<User> getUsersList();
}

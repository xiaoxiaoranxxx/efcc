package com.xiao.demo666.mapper;

import com.xiao.demo666.pojo.Users;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UsersMapper {
    List<Users> queryUserList();
    Users queryUserById(int id);
    int updateUser(Users user);
    int addUser(Users user);
    int deleteUser(int id);

}

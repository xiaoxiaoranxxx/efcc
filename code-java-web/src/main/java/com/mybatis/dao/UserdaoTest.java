package com.mybatis.dao;

import com.mybatis.pojo.User;
import org.junit.Test;

import com.mybatis.utils.T;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;

public class UserdaoTest {
    @Test
    public void testSelect(){
        SqlSession sqlSession = T.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);

        List<User> userList = userDao.getUserList();

        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.close();

    }
    @Test
    public void testByid(){
        SqlSession sqlSession = T.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        User user = userDao.getUserById(2);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void testInsert(){
        SqlSession sqlSession = T.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        userDao.addUser(new User("肖2萧然","211111"));
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testUpdate(){
        SqlSession sqlSession = T.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        userDao.updateUser(new User(1,"肖2萧然","211111"));
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testdel(){
        SqlSession sqlSession = T.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        userDao.deleteUser(103);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testlimit(){
        SqlSession sqlSession = T.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("startIndex",0);
        map.put("pageSize",2);

        List<User> userList = userDao.getUserLimit(map);
        for (User user : userList) {
            System.out.println(user.toString());
        }

        sqlSession.close();
    }


    @Test
    public void testsSelect(){
        SqlSession sqlSession = T.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);

        List<User> userList = userDao.getUsersList();

        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.close();

    }
}

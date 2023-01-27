package org.xiao.sql;

import  org.xiao.sql.*;


public class UserTest {
    public static void main(String[] args) {
        Users users =new Users();
        users.setTypeid(12113);
        users.setTypename("xiuxiu");
        Userdao userdao=new UserDaolmpl();
        userdao.addUsers(users);
    }
}

package org.xiao.sql;

import  org.xiao.sql.*;

public class UserDaolmpl extends JDBCUtil implements Userdao{

    @Override
    public boolean addUsers(Users users) {
        String sql="insert into category values(?,?)";
        int line=this.execute(sql,users.getTypeid(),users.getTypename());
        if(line>0){
            System.out.println("新增成功");
            return  true;
        }
        System.out.println("新增失败");
        return false;
    }
}

package daolmpl;

import dao.Userdao;
import pojo.Users;

public class UserTest {
    public static void main(String[] args) {
        Users users =new Users();
        users.setTypeid(11);
        users.setTypename("xiuxiu");
        Userdao userdao=new UserDaolmpl();
        userdao.addUsers(users);
    }
}

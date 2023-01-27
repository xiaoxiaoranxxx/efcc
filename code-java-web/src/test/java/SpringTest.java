import com.mybatis.pojo.Hello;
import com.mybatis.pojo.Student;
import com.mybatis.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext( "beans.xml");
//        Hello hello = (Hello) context.getBean("hello1");
//        System.out.println(hello.toString());
//
//        Student student = (Student) context.getBean("stu");
//        System.out.println(student.toString());

        User user = (User) context.getBean("user");
        System.out.printf( user.getUsername());

    }
}

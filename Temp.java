import java.util.Random;

class Student {
    private String name = "xiaoxiaoran";
    private int age = 888;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Temp {
    public static void main(String[] args) {

        Student xiao1 = new Student();
        xiao1.setAge(new Random().nextInt(30) + 1);

        System.out.print(xiao1.getAge());

    }
}

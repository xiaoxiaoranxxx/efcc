public class Simple_construction {
    public static void main(String[] args) {
        xiuxiu stu1 = new xiuxiu();
        System.out.println();
        xiuxiu stu2 = new xiuxiu();
        System.out.println();
        xiuxiu stu3 = new xiuxiu("xiao3", 66);
        System.out.println();
        xiuxiu stu4 = new xiuxiu("xiao4", 88);

        stu1.name = "11";
        stu2.name = "11";

        System.out.println();

        stu3.info();
        stu4.info();
    }
}

class xiuxiu {
    String name; // 成员属性

    int age; // 定义age属性

    static String school = "A大学"; // 定义school属性
    // String school = "A大学"; // 定义school属性

    public xiuxiu() {
        System.out.println("我是xiuxiu类的构造方法");
    }

    public xiuxiu(String name, int age) {
        this.name = name;
        this.age = age;
    }

    static {
        System.out.println("我是静态代码块");
    }

    public void info() {
        System.out.println("姓名:" + this.name + "，年龄:" + this.age + "，学校:" + school);
        // 构造方法
    }

    {
        System.out.println("我是构造代码块"); // 与构造方法同级
    }

}

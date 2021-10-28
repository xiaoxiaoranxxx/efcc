class Studentttt {
    private String name; // 声明姓名属性
    private int age; // 声明年龄属性

    public Studentttt() {
        System.out.println("--调用了无参构造方法--");
    }

    public Studentttt(String n, int a) {
        // this(); // 调用无参的构造方法

        // this.name = name; // this.age = age; Simple_package

        System.out.println("--调用了有参构造方法--");

        name = n;
        age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void read() {
        System.out.println("xiaoxiaoran-->" + name + "-->" + age);
    }

}

class Simple_package {
    public static void main(String[] args) {

        Studentttt stu = new Studentttt();
        stu.setAge(1);
        stu.setName("小明");
        stu.read();

        Studentttt stuu = new Studentttt();
        stuu.setAge(2);
        stuu.setName("小明明");
        stuu.read();

        Studentttt stuuu = new Studentttt("小明明明", 3);
        stuuu.read();
    }
}

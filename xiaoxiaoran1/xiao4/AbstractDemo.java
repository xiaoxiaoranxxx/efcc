abstract class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void say();
}

class Student extends Person {
    public Student(String name, int age) {
        super(name, age);
    }

    public void say() {
        System.out.println("学生姓名："+this.getName()+",年龄：	  "+this.getAge()+",负责回答问题。");
    }
}

class Teacher extends Person {
    public Teacher(String name, int age) {
        super(name, age);
    }

    public void say() {
        System.out.println("老师姓名："+this.getName()+",年龄：	  "+this.getAge()+",负责提出问题。");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Person per1 = new Student("张三", 18);
        Person per2 = new Teacher("李四", 30);
        per1.say();
        per2.say();
    }
}
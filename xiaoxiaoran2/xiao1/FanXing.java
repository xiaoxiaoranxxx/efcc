public class FanXing {
    public static void main(String[] args) {
        // 创建对象
        Dogg dog = new Dogg();
        // 调用方法,传入的参数是什么类型,返回值就是什么类型
        dog.show("hello");
        dog.show(12);
        dog.show(12.5);
    }
}


class Dogg {
    String eat;
    Integer age;

    public <T> void show(T t) {
        System.out.println(t);
    }
}

public class DongWuTest {
    public static void main(String[] args) {

        Feeder feeder = new Feeder("小华");

        feeder.speak();
        feeder.setName("肖萧然");
        feeder.speak();
        System.out.println();

        Dog dog = new Dog("小狗");
        dog.setName("哈士奇");
        System.out.print(dog.getName());
        dog.shout();

        Food food = new Bone();
        feeder.feed(dog, food);

        Cat cat = new Cat("小猫");

        food = new Fish("黄花鱼");
        feeder.feed(cat, food);
    }
}
public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void shout() {
        System.out.print("喵喵喵~~~");
    }

    public void eat(Food food) {
        System.out.println(getName() + "正在吃着香喷喷的" + food.getName());
    }

    
}
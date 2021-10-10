public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void shout() {
        System.out.print("汪汪汪~~~\n");
    }

    @Override
    public void eat(Food food) {
        System.out.println(getName() + "正在啃着香喷喷的" + food.getName());
    }
}

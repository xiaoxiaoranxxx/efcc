public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void shout();

    public abstract void eat(Food food);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
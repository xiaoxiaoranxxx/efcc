package xiaoxiaoran1.xiao2;


public class Book {
    private int id;
    private String name;
    private double price;
    private int storage;

    public Book(int id, String name, double price, int storage) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.storage = storage;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

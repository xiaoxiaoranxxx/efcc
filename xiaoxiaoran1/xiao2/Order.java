package xiaoxiaoran1.xiao2;

public class Order {
    private String orderId;
    private OrderItem items[];
    private double total;

    // 有参构造
    public Order(String orderId) {
        this.orderId = orderId;
        this.items = new OrderItem[3];
    }

    // 获取订单号
    public String getOrderId() {
        return orderId;
    }

    // 获取订单列表
    public OrderItem[] getItems() {
        return items;
    }

    // 获取订单总额
    public double getTotal() {
        calTotal();
        return total;
    }

    // 指定一个订单项
    public void setItem(OrderItem item, int i) {
        this.items[i] = item;
    }

    // 计算订单总额
    public void calTotal() {
        double total = 0;
        for (int i = 0; i < items.length; i++) {
            total += items[i].getNum() * items[i].getBook().getPrice();
        }
        this.total = total;
    }
}
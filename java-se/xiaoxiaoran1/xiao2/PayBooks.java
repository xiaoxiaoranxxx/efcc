package xiaoxiaoran1.xiao2;

import java.util.Scanner;

public class PayBooks {
    public static void main(String[] args) {
        Book books[] = new Book[3];
        //模拟从数据库中读取图书信息并输出
        outBooks(books);
        // 顾客购买图书
        Order order = purchase(books);
        // 输出订单信息
        outOrder(order);
    }

    // 顾客购买图书
    public static Order purchase(Book books[]) {
        Order order = new Order("00001");
        OrderItem item = null;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i ++) {
            System.out.println("请输入图书编号选择图书：");
            int cno = in.nextInt();
            System.out.println("请输入购买图书数量：");
            int pnum = in.nextInt();
            item = new OrderItem(books[cno-1],pnum);
            order.setItem(item, i);
            System.out.println("请继续购买图书。");
        }
        in.close();
        return order;
    }

    // 输出订单信息
    public static void outOrder(Order order) {
        System.out.println("\n\t图书订单");
        System.out.println("图书订单号：" + order.getOrderId());
        System.out.println("图书名称\t购买数量\t图书单价");
        System.out.println("--------------------------------------");
        OrderItem items[] = order.getItems();
        for (int i = 0; i < items.length; i++) {
            System.out.println(
                    items[i].getBook().getName() + "\t" + items[i].getNum() + "\t" + items[i].getBook().getPrice());
            // System.out.println("\n");
        }
        System.out.println("---------------------------------------");
        System.out.println("订单总额：\t\t" + order.getTotal());
    }

    // 模拟从数据库中读取图书信息并输出
    public static void outBooks(Book books[]) {
        books[0] = new Book(1, "Java教程", 30.6, 30);
        books[1] = new Book(2, "JSP教程", 42.1, 40);
        books[2] = new Book(3, "SSH架构", 47.3, 15);
        System.out.println("\t图书列表");
        System.out.println("图书编号\t图书名称\t\t图书单价\t库存数量");
        System.out.println("---------------------------------------");
        for (int i = 0; i < books.length; i++) {
            System.out.println(
                    i + 1 + "\t" + books[i].getName() + "\t" + books[i].getPrice() + "\t" + books[i].getStorage());
        }
        System.out.println("---------------------------------------");
    }
}
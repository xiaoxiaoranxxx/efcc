import java.util.Scanner;

public class Purchase_goods {
    public static void main(String[] args) {
        char index;
        int money = 20;
        System.out.print("铅笔a,橡皮b,可乐c,零食d-->");
        Scanner sc = new Scanner(System.in);
        index = sc.next().charAt(0);
        xiuxiu(index, money - 12);
        sc.close();
    }

    public static void xiuxiu(char aa, int money) {
        int num = 0;
        int danjia = 0;
        int lulu = 0;
        String name = "666";
        switch (aa) {
            case 'a':
                name = "铅笔";
                danjia = 1;
                break;
            case 'b':
                danjia = 2;
                name = "橡皮";
                break;
            case 'c':
                danjia = 3;
                name = "可乐";
                break;
            case 'd':
                danjia = 5;
                name = "零食";
                break;
        }
        num = money / danjia;
        lulu = money - danjia * num;
        System.out.println("可以购买商品" + name + num + "个" + ",还剩" + lulu + "元");
    }
}

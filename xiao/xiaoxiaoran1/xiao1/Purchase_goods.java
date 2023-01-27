import java.util.Scanner;

public class Purchase_goods {
    public static void main(String[] args) {
        int index = 5, money = 20, num, remainder;

        String[] name = { "铅笔", "橡皮", "可乐", "零食" };
        int[] danjia = { 1, 2, 3, 5 };
        for (int i = 0; i < name.length; i++)
            System.out.println("序号为->" + (i + 1) + ",这" + name[i] + "的价格为" + danjia[i] + "元");

        Scanner sc = new Scanner(System.in);

        while (!(index >= 0 && index < 4)) {
            System.out.print("请输入其他需要购买商品的序列号-->");
            index = sc.nextInt();
            index--;
        }
        
        num = (money -= 12) / danjia[index];
        remainder = money - danjia[index] * num;

        System.out.println("可以购买商品" + name[index] + num + "个" + ",还剩" + remainder + "元");

        sc.close();
    }

}

import java.util.Scanner;

public class Character_string {
    public static void main(String[] args) {
        // 键盘录入要转化的字符串。用Scanner实现。
        // Character_string
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要转换的字符串：");
        String ss = sc.nextLine();
        // 定义一个二维数组。其中4代表每一行长度。ss.length()根据键盘录入的字 符串表示有多少行。
        int[][] arr = new int[ss.length()][4];
        // 利用for循环遍历字符串，遍历后用String的charAt()方法获取每个字符并 转化成int。char与int进行运算，char的数值要减去
        // 48,因为ASCII码中0 的值是48,1就是49。
        for (int i = 0; i < ss.length(); i++) {
            int charss = (int) ss.charAt(i) - 48;
            for (int j = 0; j < 4; j++) {
                // 转化成int后再用for循环获取每一个int类型的数进行转化成二进 制赋值给数组。其中Math.pow()方法是Math类中求幂的方法。
                arr[i][j] = (int) ((charss / Math.pow(2, 3 - j)) % 2);
            }
        }
        // 最后用双重for循环遍历二维数组。将结果输出到控制台。
        System.out.println("二进制的数是：");
        // 最后用双重for循环遍历二维数组。将结果输出到控制台。
        for (int i = 0; i < ss.length(); i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j]);
            }
        }
        sc.close();
    }
}
import java.time.LocalDate;
import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要判断的年份：");
        int year = sc.nextInt();
        // 实例化出需要判断年份的3月1日
        LocalDate of = LocalDate.of(year, 3, 1);
        // 将3月1日减去一天得到2月的最后一天日期
        LocalDate newof = of.minusDays(1);
        System.out.println(year + "年的2月有" + newof.getDayOfMonth() + "天");
        sc.close();
    }
}
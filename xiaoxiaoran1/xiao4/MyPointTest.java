abstract class MyPoint {
    public abstract void show();
}

// 打印正方形
class MyPrintSquare extends MyPoint {
    @Override
    public void show() {
        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 5; ++j) {
                if (j == 0 || j == 4)
                    System.out.print('*');
                else if (i == 0 || i == 4)
                    System.out.print('*');
                else
                    System.out.print(' ');
            }
            System.out.println();
        }
    }
}

// 打印圆形
class MyPrintCircle extends MyPoint {
    @Override
    public void show() {
        for (int y = 0; y <= 2 * 5; y += 2) {
            int x = (int) Math.round(5 - Math.sqrt(2 * 5 * y - y * y));
            int len = 2 * (5 - x);
            for (int i = 0; i <= x; i++) {
                System.out.print(' ');
            }
            System.out.print('*');
            for (int j = 0; j <= len; j++) {
                System.out.print(' ');
            }
            System.out.println('*');
        }
    }
}

public class MyPointTest {
    public static void myShow(MyPoint a) {
        a.show();
    }

    public static void main(String[] args) {
        MyPoint mp1 = new MyPrintSquare();
        MyPoint mp2 = new MyPrintCircle();
        myShow(mp1);
        myShow(mp2);
    }
}
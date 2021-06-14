public class method {
    public static void main(String[] args) {
        xiao();

        // xunhuan();

        System.out.print(sum(1, 2));

        int num = sum(11, 22);
        System.out.println(num + "秀秀");

    }

    public static void xunhuan() {
        int money = 1;
        while (true) {
            for (int i = 0; i <= 8; i++) {
                if (money >= 1000) {
                    System.out.println("ok");
                    if (money > 1222)
                        break;
                } else if (money > 500)
                    System.out.println("5555");
                else {
                    System.out.println("false");
                }
                money += 250;
            }
            if (money > 1)
                break;
        }
    }

    public static void xiao() {
        System.out.println("xiaoxiaoran666");
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
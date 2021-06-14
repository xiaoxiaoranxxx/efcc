public class method {
    public static void main(String[] args) {
        xiao();

        int money = 1;
        while (true) {
            for (int i = 0; i <= 8; i++) {
                if (money >= 1000) {
                    System.out.println("ok");
                    if(money>1222)
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
}
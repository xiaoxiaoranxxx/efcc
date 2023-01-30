package xiaoxiaoran1.薪资管理;

public class Testdemo {
    public static void main(String[] args) {
        Graduate gr = new Graduate("xiaoxiaoran", "男", 66, 9999, 1166);
        judgeLoan(gr);
    }

    public static void judgeLoan(Graduate gr) {
        if (gr.getPay() * 12 - gr.getFree() * 2 < 1000) {
            System.out.println("ok");
        } else {
            System.out.println("no");
        }
    }
}

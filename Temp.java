import java.util.Random;

public class Temp {
    public static void main(String[] args) {
        int a = 1;

        int[] danjia = { 1, 2, 3, 5 };

        int dan = danjia[a];
        System.out.println(dan);
        String name = "s";

        System.out.println(name.equals("ss"));
        for (int i = 0; i < 100; i++) {
            int randomNumber = new Random().nextInt(30) + 1;
            System.out.print(randomNumber + " ");
        }

    }

}

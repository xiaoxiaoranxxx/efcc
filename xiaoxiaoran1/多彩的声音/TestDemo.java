package xiaoxiaoran1.多彩的声音;

import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("你想听什么？请输入：");
        System.out.println("0-收音机  1-随身听  2-手机");
        int choice;
        choice = in.nextInt();
        SampleDisplay sampledisplay = new SampleDisplay();
        if (choice == 0)
            sampledisplay.display(new Radio());
        else if(choice == 1)
            sampledisplay.display(new Walkman());
        else if(choice == 2)
            sampledisplay.display(new MobilePhone());
        else  
            System.out.println("您的输入有误，请重新输入！");
        in.close();
    }
}
/*
** Hello.java   
** xiaoxiaoran
** cd "c:\Users\Administrator\efcc\xiaoxiaoran1\xiao1\" ; if ($?) { javac -encoding utf-8 hello.java } ; if ($?) { java hello }
*/


// JVM java virtual machine 翻译作用
// JRE java runtime environment 运行环境
// JDK java development kit 开发工具包


public class hello { // 定义类
    public static void main(String[] args) { // main方法,程序起点

        System.out.println("肖萧然最秀\nhello world");
        System.out.println(3.1444545);
        System.out.println('A');
        System.out.println(false);

        int x1 = 12;
        float x2 = 1.1111F;
        byte x3 = 11;
        long x4 = 888888888888888888L;

        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);

        char x5 = 'A';
        System.out.println(x5 + 1); // 66

        String x6 = "xiaoxiaoran";
        System.out.println(x6 + "zuixiu"); // xiaoxiaoranzuixiu
        System.out.println(x6 + 2222);  // xiaoxiaoran2222
        
    }


}

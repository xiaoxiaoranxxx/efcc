/*
** Hello.java   
** xiaoxiaoran
** cd "c:\Users\Administrator\efcc\xiaoxiaoran1\xiao1\" ; if ($?) { javac -encoding utf-8 hello.java } ; if ($?) { java hello }
**
**      CLASSPATH -> .;%JAVA_HOME%\lib;%JAVA_HOME%\lib\tools.jar;
**      JAVA_HOME -> D:\Program Files\Java\jdk-16.0.2
**      JAVA_HOME -> C:\Program Files\Java\jdk1.8.0_191
**      %JAVA_HOME%\bin
**      %JAVA_HOME%\jre\bin
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
        System.out.println(x6 + 2222); // xiaoxiaoran2222

    }

}

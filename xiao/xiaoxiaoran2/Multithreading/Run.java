public class Run {
    public static void main(String[] args) {
        MyThreadd myThread = new MyThreadd(); // 创建MyThread的实例对象
        Thread thread = new Thread(myThread); // 创建线程对象
        thread.start(); // 开启线程，执行线程中的run()方法
        while (true) {
            System.out.println("main()方法在运行");
        }
    }
}

class MyThreadd implements Runnable {
    public void run() { // 线程的代码段，当调用start()方法时，线程从此处开始执行
        while (true) {
            System.out.println("MyThread类的run()方法在运行");
        }
    }
}

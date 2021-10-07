public class PhoneTest {
    public static void main(String[] args) {
        // 通过无参构造创建手机对象一
        Phone p1 = new Phone();
        p1.brand = "苹果";
        p1.type = "iphoneX";
        p1.os = "ios";
        p1.price = 8888;
        p1.memorySize = 16;
        // 测试p1的各项功能
        p1.about();
        p1.call(3);
        p1.playGame();
        p1.playMusic("我的中国心");
        System.out.println("********************");
        
        Phone p2 = new Phone("华为", "华为荣耀20", "Android", 6666, 16);
        // 测试p2 的各项功能
        p2.about();
        p2.call(4);
        p2.playGame();
        p2.playMusic("北京欢迎你");
    }
}
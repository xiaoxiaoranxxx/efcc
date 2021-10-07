public class Phone {
    String brand; // 品牌
    String type; // 型号
    String os; // 操作系统
    int price; // 价格
    int memorySize; // 内存
    // 无参构造

    public Phone() {
    }

    // 有参构造
    public Phone(String brand, String type, String os, int price, int memorySize) {
        this.brand = brand;
        this.type = type;
        this.os = os;
        this.price = price;
        this.memorySize = memorySize;
    }

    // 关于本机
    public void about() {
        System.out.println("品牌：" + brand + "\n" + "型号：" + type + "\n" + "操作系统：" + os + "\n" + "价格：" + price + "\n"
                + "内存：" + memorySize + "\n");
    }

    // 打电话
    public void call(int num) {
        System.out.println("使用自动拨号功能：");
        String phoneNo = "";
        switch (num) {
            case 1:
                phoneNo = "爸爸的号。";
                break;
            case 2:
                phoneNo = "妈妈的号。";
                break;
            case 3:
                phoneNo = "爷爷的号。";
                break;
            case 4:
                phoneNo = "奶奶的号。";
                break;
        }
        System.out.println(phoneNo);
    }

    // 打游戏
    public void playGame() {
        System.out.println("玩扫雷游戏。");
    }

    // 下载音乐
    public void downloadMusic(String song) {
        System.out.println("开始下载。。。。");
        System.out.println("下载完成。。。。");
    }

    // 播放音乐
    public void playMusic(String song) {
        System.out.println("播放歌曲：" + song);
    }
}
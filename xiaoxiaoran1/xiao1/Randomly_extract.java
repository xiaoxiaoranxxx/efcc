import java.util.Random;

public class Randomly_extract {

    public static void addAudience(String[] audience) {
        for (int i = 0; i < audience.length; i++)
            audience[i] = "xiaoxiaoran" + i;
    }

    public static void printAudience(String[] audience) {
        // 遍历数组，得到每个观众姓名
        for (int i = 0; i < audience.length; i++) {
            String name = audience[i];
            System.out.println("第" + (i + 1) + "个观众姓名:" + name);
        }
    }

    // 随机点名
    public static String randomAudience(String[] audience) {
        int index = new Random().nextInt(audience.length);
        String name = audience[index];
        return name;
    }

    public static void main(String[] args) {
        System.out.println("--------xiaoxiaoran---------");
        // 创建一个长度为3的数组存储观众姓名
        String[] audience = new String[30];
        addAudience(audience);
        // printAudience(audience);
        String randomName = randomAudience(audience);
        System.out.println("随机抽取的幸运观众是-->" + randomName);
        System.out.println("--------xiaoxiaoran---------");
    }
}
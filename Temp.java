import java.util.*;

public class Temp {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>(); // 创建Map集合
        map.put(1, "张三"); // 存储键和值
        map.put(2, "李四");
        map.put(3, "王五");
        Set<Integer> keySet = map.keySet(); // 获取键的集合
        Iterator<Integer> it = keySet.iterator(); // 迭代键的集合
        while (it.hasNext()) {
            Object key = it.next();
            Object value = map.get(key); // 获取每个键所对应的值
            System.out.println(key + ":" + value);
        }
    }
}

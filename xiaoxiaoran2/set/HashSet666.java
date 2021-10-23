import java.util.*;

public class HashSet666 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>(); // 创建HashSet集合
        set.add("张三"); // 向该Set集合中添加字符串
        set.add("李四");
        set.add("王五");
        set.add("李四"); // 向该Set集合中添加重复元素
        Iterator<String> it = set.iterator(); // 获取Iterator对象
        
        while (it.hasNext()) { // 通过while循环，判断集合中是否有元素
            Object obj = it.next();// 如果有元素，就通过迭代器的next()方法获取元素
            System.out.println(obj);
        }

        for (String string : set) {
            System.out.println(string);
        }
    }
}

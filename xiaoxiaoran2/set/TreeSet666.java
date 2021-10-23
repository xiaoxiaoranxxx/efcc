import java.util.*;

public class TreeSet666 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<Integer>(); // 创建HashSet集合
        set.add(1); // 向该Set集合中添加字符串
        set.add(34);
        set.add(5);
   
        Iterator<Integer> it = set.iterator(); // 获取Iterator对象

        while (it.hasNext()) { // 通过while循环，判断集合中是否有元素
            Object obj = it.next();// 如果有元素，就通过迭代器的next()方法获取元素
            System.out.println(obj);
        }

        for (int string : set) {
            System.out.println(string);
        }
    }
}

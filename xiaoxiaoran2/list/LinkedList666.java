import java.util.*;

public class LinkedList666 {
    public static void main(String[] args) {
        LinkedList<String> link = new LinkedList<String>(); // 创建LinkedList集合
        link.add("张三");
        link.add("李四");
        link.add("王五");
        link.add("赵六");
        System.out.println(link.toString()); // 取出并打印该集合中的元素
        link.add(3, "Student"); // 向该集合中指定位置插入元素
        link.addFirst("First"); // 向该集合第一个位置插入元素
        System.out.println(link);
        System.out.println(link.getFirst()); // 取出该集合中第一个元素
        link.remove(3); // 移除该集合中指定位置的元素
        link.removeFirst(); // 移除该集合中第一个元素
        System.out.println(link);

        System.out.println();

        Iterator<String> it = link.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }

        System.out.println();

        for (String string : link) {
            System.out.println(string);
        }
    }
}

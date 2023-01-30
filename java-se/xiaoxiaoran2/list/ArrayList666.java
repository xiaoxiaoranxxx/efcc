import java.util.*;

public class ArrayList666 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(); // 创建ArrayList集合
        list.add("张三"); // 向集合中添加元素
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        // 获取集合中元素的个数
        System.out.println("集合的长度：" + list.size());
        // 取出并打印指定位置的元素
        System.out.println("第2个元素是：" + list.get(1));

        System.out.println();

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }

        System.out.println();

        for (String string : list) {
            System.out.println(string);
        }
    }
}

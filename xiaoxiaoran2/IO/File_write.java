import java.io.*;

public class File_write {
    public static void main(String[] args) throws Exception {
        // 创建一个FileWriter对象用于向文件中写入数据
        FileWriter writer = new FileWriter("1.txt",true);
        String str = "xiaoxiaoran";
        writer.write(str); // 将字符数据写入到文本文件中
        writer.write("\r\n"); // 将输出语句换行
        writer.close(); // 关闭写入流，释放资源
    }
}

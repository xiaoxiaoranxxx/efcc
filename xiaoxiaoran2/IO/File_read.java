import java.io.*;

public class File_read {
    public static void main(String[] args) throws Exception {
        // 创建一个FileReader对象用来读取文件中的字符
        FileReader reader = new FileReader("1.txt");
        int ch; // 定义一个变量用于记录读取的字符
        while ((ch = reader.read()) != -1) { // 循环判断是否读取到文件的末尾
            System.out.print((char) ch); // 不是字符流末尾就转为字符打印
        }
        reader.close(); // 关闭文件读取流，释放资源
    }
}

//
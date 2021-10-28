import java.io.*;

public class Line_read {
    public static void main(String[] args) throws Exception {
        FileReader reader = new FileReader("1.txt");
        // 创建一个BufferedReader缓冲对象
        BufferedReader br = new BufferedReader(reader);
        FileWriter writer = new FileWriter("1c.txt");
        // 创建一个BufferdWriter缓冲区对象
        BufferedWriter bw = new BufferedWriter(writer);
        String str;
        // 每次读取一行文本，判断是否到文件末尾
        while ((str = br.readLine()) != null) {
            bw.write(str);
            // 写入一个换行符，该方法会根据不同的操作系统生成相应的换行符
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}

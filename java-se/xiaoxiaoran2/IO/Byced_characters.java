import java.io.*;

public class Byced_characters {
    public static void main(String[] args) throws Exception {
        // 创建字节输入流
        FileInputStream in = new FileInputStream("1.txt");
        // 将字节流输入转换成字符输入流
        InputStreamReader isr = new InputStreamReader(in);

        // 赋予字符流对象缓冲区
        BufferedReader br = new BufferedReader(isr);
        FileOutputStream out = new FileOutputStream("1c.txt");
        
        // 将字节输出流转换成字符输出流
        OutputStreamWriter osw = new OutputStreamWriter(out);
        // 赋予字符输出流对象缓冲区
        BufferedWriter bw = new BufferedWriter(osw);
        String line;
        while ((line = br.readLine()) != null) { // 判断是否读到文件末尾
            bw.write(line); // 输出读取到的文件
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}

// Byced_characters
import java.io.*;

public class Write {
    public static void main(String[] args) throws Exception {
        OutputStream out = new FileOutputStream("1.txt ", true);
        String str = "666";
        byte[] b = str.getBytes();
        for (int i = 0; i < b.length; i++) {
            out.write(b[i]);
        }
        out.close();
    }
}

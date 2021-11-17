import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;

class MyNotePad extends JFrame implements ActionListener {
    private JTextArea jta = null;
    private JMenuBar jmb = null;
    private JMenu jm = null;
    private JMenuItem jmiOpen = null;
    private JMenuItem jmiSave = null;
    private JMenuItem jmiExit = null;
    private JFileChooser jfc = null;

    public void xiu() {
        System.out.println("ok");
    }

    public MyNotePad() {
        jta = new JTextArea();
        this.setLayout(new BorderLayout());
        this.add(jta);
        jmb = new JMenuBar();
        jm = new JMenu("文件");
        jmiOpen = new JMenuItem("打开");
        jmiOpen.addActionListener(this);
        jmiOpen.setActionCommand("打开");
        jmiSave = new JMenuItem("保存");
        jmiSave.addActionListener(this);
        jmiSave.setActionCommand("保存");
        jmiExit = new JMenuItem("退出");
        jmiExit.addActionListener(this);
        jmiExit.setActionCommand("退出");
        jm.add(jmiOpen);
        jm.add(jmiSave);
        jm.add(jmiExit);
        jmb.add(jm);
        this.setJMenuBar(jmb);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        String str = e.getActionCommand();
        if (str.equals("打开")) {
            System.out.println("打开");
            jfc = new JFileChooser();
            jfc.setDialogTitle("请选择文件！");
            jfc.showOpenDialog(null);
            jfc.setVisible(true);
            File file = jfc.getSelectedFile();
            BufferedReader br = null;
            try {
                FileReader fReader = new FileReader(file);
                br = new BufferedReader(fReader);
                String readStr = "";
                String allCode = "";
                while ((readStr = br.readLine()) != null) {
                    allCode += readStr + "\r\n";
                }
                jta.setText(allCode);
            } catch (Exception e2) {
                e2.printStackTrace();
              
            } finally {
                try {
                    br.close();
                } catch (IOException e1) {
                  
                    e1.printStackTrace();
                }
            }
        } else if (str.equals("保存")) {
            JFileChooser jfc = new JFileChooser();
            jfc.setDialogTitle("已保存");
            jfc.showSaveDialog(null);
            File file = jfc.getSelectedFile();
            BufferedWriter bw = null;
            try {
                FileWriter fw = new FileWriter(file);
                bw = new BufferedWriter(fw);
                String jtaStr = jta.getText();
                bw.write(jtaStr);
            } catch (Exception e2) {
               
                e2.printStackTrace();
            } finally {
                try {
                    bw.close();
                } catch (IOException e1) {
                   
                    e1.printStackTrace();
                }
            }
        } else if (str.equals("退出")) {
            System.exit(0);
        }
    }
}

public class MyMenu {
    public static void main(String[] str) {
        MyNotePad notePad = new MyNotePad();
        notePad.xiu();
    }

}
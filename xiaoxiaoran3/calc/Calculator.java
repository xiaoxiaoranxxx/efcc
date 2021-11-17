import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Vector;
import java.math.BigDecimal;

public class Calculator {
    // 操作数1，为了程序的安全，初值一定设置，这里我们设置为0。
    String str1 = "0";
    // 操作数2
    String str2 = "0";
    // 运算符
    String signal = "+";
    // 运算结果
    String result = "";
    // 以下k1至k5为状态开关
    // 开关1用于选择输入方向，将要写入str1或str2
    // 为 1 时写入 str1，为 2 时写入 str2
    int k1 = 1;
    // 开关 2 用于记录符号键的次数
    // 如果 k2>1 说明进行的是 2+3-9+8 这样的多符号运算
    int k2 = 1;
    // 开关3用于标识 str1 是否可以被清 0
    // 等于 1 时可以，不等于1时不能被清0
    int k3 = 1;
    // 开关4用于标识 str2 是否可以被清 0
    // 等于 1 时可以，不等于1时不能被清0
    int k4 = 1;
    // 开关5用于控制小数点可否被录入
    // 等于1时可以，不为1时，输入的小数点被丢掉
    int k5 = 1;
    // store的作用类似于寄存器，用于记录是否连续按下符号键
    JButton store;
    // vt 存储之前输入的运算符。
    @SuppressWarnings("rawtypes")
    Vector vt = new Vector(20, 10);
    // 创建一个 JFrame 对象并初始化。JFrame 可以理解为程序的主窗体。
    JFrame frame = new JFrame("Calculator");
    // 创建一个JTextField对象并初始化。JTextField用于显示操作和计算结果的文本框。
    // 参数 20 表明可以显示 20 列的文本内容
    JTextField result_TextField = new JTextField(result, 20);
    // 清除按钮
    JButton clear_Button = new JButton("Clear");
    // 数字键0到9
    JButton button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    // 计算命令按钮，加减乘除以及小数点等
    JButton button_Dian = new JButton(".");
    JButton button_jia = new JButton("+");
    JButton button_jian = new JButton("-");
    JButton button_cheng = new JButton("*");
    JButton button_chu = new JButton("/");
    JButton button_dy = new JButton("=");

    public Calculator() {
        button0.setMnemonic(KeyEvent.VK_0);
        result_TextField.setHorizontalAlignment(JTextField.RIGHT);
        // 创建一个 Jpanel 对象并初始化
        JPanel pan = new JPanel();
        // 设置该容器的布局为四行四列，边距为5像素
        pan.setLayout(new GridLayout(4, 4, 5, 5));
        // 将用于计算的按钮添加到容器内
        pan.add(button7);
        pan.add(button8);
        pan.add(button9);
        pan.add(button_chu);
        pan.add(button4);
        pan.add(button5);
        pan.add(button6);
        pan.add(button_cheng);
        pan.add(button1);
        pan.add(button2);
        pan.add(button3);
        pan.add(button_jian);
        pan.add(button0);
        pan.add(button_Dian);
        pan.add(button_dy);
        pan.add(button_jia);
        // 设置 pan 对象的边距
        pan.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        // 按照同样的方式设置第二个JPanel
        JPanel pan2 = new JPanel();
        pan2.setLayout(new BorderLayout());
        pan2.add(result_TextField, BorderLayout.WEST);
        pan2.add(clear_Button, BorderLayout.EAST);
        // 设置主窗口出现在屏幕上的位置
        frame.setLocation(300, 200);
        // 设置窗体可以调大小
        frame.setResizable(true);
        // 窗体中可以放置 JPanel，这里我们将面板pan和面板pan2让如窗体
        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add(pan2, BorderLayout.NORTH);
        frame.getContentPane().add(pan, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
        // Listener类中编写的是数字键的响应逻辑。
        class Listener implements ActionListener {
            @SuppressWarnings("unchecked")
            public void actionPerformed(ActionEvent e) {
                String ss = ((JButton) e.getSource()).getText();
                store = (JButton) e.getSource();
                vt.add(store);
                if (k1 == 1) {
                    if (k3 == 1) {
                        str1 = "";
                        k5 = 1;
                    }
                    str1 = str1 + ss;
                    k3 = k3 + 1;
                    result_TextField.setText(str1);
                } else if (k1 == 2) {
                    if (k4 == 1) {
                        str2 = "";
                        k5 = 1;
                    }
                    str2 = str2 + ss;
                    k4 = k4 + 1;
                    result_TextField.setText(str2);
                }
            }
        }
        // Listener_signal类中编写了运算符号键的响应逻辑
        class Listener_signal implements ActionListener {
            @SuppressWarnings("unchecked")
            public void actionPerformed(ActionEvent e) {
                String ss2 = ((JButton) e.getSource()).getText();
                store = (JButton) e.getSource();
                vt.add(store);
                if (k2 == 1) {
                    k1 = 2;
                    k5 = 1;
                    signal = ss2;
                    k2 = k2 + 1;
                } else {
                    int a = vt.size();
                    JButton c = (JButton) vt.get(a - 2);
                    if (!(c.getText().equals("+")) && !(c.getText().equals("-")) && !(c.getText().equals("*"))
                            && !(c.getText().equals("/"))) {
                        cal();
                        str1 = result;
                        k1 = 2;
                        k5 = 1;
                        k4 = 1;
                        signal = ss2;
                    }
                    k2 = k2 + 1;
                }
            }
        }
        // Listener_clear类中编写了清除键的响应逻辑
        class Listener_clear implements ActionListener {
            @SuppressWarnings("unchecked")
            public void actionPerformed(ActionEvent e) {
                store = (JButton) e.getSource();
                vt.add(store);
                k5 = 1;
                k2 = 1;
                k1 = 1;
                k3 = 1;
                k4 = 1;
                str1 = "0";
                str2 = "0";
                signal = "";
                result = "";
                result_TextField.setText(result);
                vt.clear();
            }
        }
        // Listener_dy类中编写的是等于号键的响应逻辑
        class Listener_dy implements ActionListener {
            @SuppressWarnings("unchecked")
            public void actionPerformed(ActionEvent e) {
                store = (JButton) e.getSource();
                vt.add(store);
                cal();
                k1 = 1;
                k2 = 1;
                k3 = 1;
                k4 = 1;
                str1 = result;
            }
        }
        // Listener_xiaos类中编写的是小数点键的相应逻辑
        class Listener_xiaos implements ActionListener {
            @SuppressWarnings("unchecked")
            public void actionPerformed(ActionEvent e) {
                store = (JButton) e.getSource();
                vt.add(store);
                if (k5 == 1) {
                    String ss2 = ((JButton) e.getSource()).getText();
                    if (k1 == 1) {
                        if (k3 == 1) {
                            str1 = "";
                            k5 = 1;
                        }
                        str1 = str1 + ss2;
                        k3 = k3 + 1;
                        result_TextField.setText(str1);
                    } else if (k1 == 2) {
                        if (k4 == 1) {
                            str2 = "";
                            k5 = 1;
                        }
                        str2 = str2 + ss2;
                        k4 = k4 + 1;
                        result_TextField.setText(str2);
                    }
                }
                k5 = k5 + 1;
            }
        }
        // 监听等于键
        Listener_dy jt_dy = new Listener_dy();
        // 监听数字键
        Listener jt = new Listener();
        // 监听符号键
        Listener_signal jt_signal = new Listener_signal();
        // 监听清除键
        Listener_clear jt_c = new Listener_clear();
        // 监听小数点键
        Listener_xiaos jt_xs = new Listener_xiaos();
        button7.addActionListener(jt);
        button8.addActionListener(jt);
        button9.addActionListener(jt);
        button_chu.addActionListener(jt_signal);
        button4.addActionListener(jt);
        button5.addActionListener(jt);
        button6.addActionListener(jt);
        button_cheng.addActionListener(jt_signal);
        button1.addActionListener(jt);
        button2.addActionListener(jt);
        button3.addActionListener(jt);
        button_jian.addActionListener(jt_signal);
        button0.addActionListener(jt);
        button_Dian.addActionListener(jt_xs);
        button_dy.addActionListener(jt_dy);
        button_jia.addActionListener(jt_signal);
        clear_Button.addActionListener(jt_c);
        // 窗体关闭事件的响应程序
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    // calc()方法中编写了计算逻辑的实现。
    public void cal() {
        double a2;
        double b2;
        String c = signal;
        double result2 = 0;
        if (c.equals("")) {
            result_TextField.setText("Please input operator");
        } else {
            if (str1.equals("."))
                str1 = "0.0";
            if (str2.equals("."))
                str2 = "0.0";
            a2 = Double.valueOf(str1).doubleValue();
            b2 = Double.valueOf(str2).doubleValue();
            if (c.equals("+")) {
                result2 = a2 + b2;
            }
            if (c.equals("-")) {
                result2 = a2 - b2;
            }
            if (c.equals("*")) {
                BigDecimal m1 = new BigDecimal(Double.toString(a2));
                BigDecimal m2 = new BigDecimal(Double.toString(b2));
                result2 = m1.multiply(m2).doubleValue();
            }
            if (c.equals("/")) {
                if (b2 == 0) {
                    result2 = 0;
                } else {
                    result2 = a2 / b2;
                }
            }
            result = ((new Double(result2)).toString());
            result_TextField.setText(result);
        }
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        try {
            // 通过 UIManager 来设置窗体的 UI 风格
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Calculator cal = new Calculator();
    }
}
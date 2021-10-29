import javax.swing.*;

class Temp extends JFrame {
    private static void createAndShowGUI() {
        // 创建并设置JFrame容器窗口
        JFrame frame = new JFrame();
        // 设置关闭窗口时的默认操作
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 设置窗口标题
        frame.setTitle("xiaoxiaoran");
        // 设置窗口尺寸
        frame.setSize(400, 400);
        // 设置窗口的显示位置
        frame.setLocation(300, 200);
        // 让组件显示
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // 使用SwingUtilities工具调用createAndShowGUI()方法显示GUI程序
        SwingUtilities.invokeLater(Temp::createAndShowGUI);
    }
}

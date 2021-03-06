import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class T extends JFrame implements ActionListener {
	JLabel title;
	JTextArea result;
	JTextField tf1, tf2;
	JComboBox<String> sy;
	JButton cal, cal2;
	JPanel jP;

	public T(String s) {
		super(s);
		this.setSize(400, 300);
		this.setLocation(600, 300);
		this.init();
	}

	//布局方法
	public void init() {
		title = new JLabel("计算器", 0);
		title.setFont(new Font("黑体", 1, 20));

		result = new JTextArea();
		tf1 = new JTextField(5);
		tf2 = new JTextField(5);

		tf2.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == 10)
					xiu();
			}
		});

		sy = new JComboBox<String>();
		sy.addItem("+");
		sy.addItem("-");
		sy.addItem("*");
		sy.addItem("/");
		sy.addItem("%");

		cal = new JButton("计算");
		cal.setForeground(Color.red);
		cal2 = new JButton("clear");
		cal2.setForeground(Color.blue);
		cal2.setBackground(Color.white);

		cal.addActionListener(this);
		cal2.addActionListener(this);

		jP = new JPanel();
		jP.add(tf1);
		jP.add(sy);
		jP.add(tf2);
		jP.add(cal);
		jP.add(cal2);
		this.add("North", title);
		this.add("Center", result);
		this.add("South", jP);
		result.setEditable(false);

	}

	//监听方法
	public void actionPerformed(ActionEvent e1) {
		if (e1.getActionCommand() == "计算")
			xiu();
		if (e1.getActionCommand() == "clear") {
			result.setText("");
			tf1.setText("");
			tf2.setText("");
		}
	}

	//计算方法
	public void xiu() {   
		try {
			double c1 = Double.parseDouble(tf1.getText().toString());
			double c2 = Double.parseDouble(tf2.getText().toString());
			double c = 0;
			int flag = 1;

			if (sy.getSelectedItem() == "+")
				c = c1 + c2;
			else if (sy.getSelectedItem() == "-")
				c = c1 - c2;
			else if (sy.getSelectedItem() == "*")
				c = c1 * c2;
			else if (sy.getSelectedItem() == "/") {
				if (c2 != 0)
					c = c1 / c2;
				else
					flag = 2;
			} else if (sy.getSelectedItem() == "%") {
				if (c2 != 0)
					c = c1 % c2;
				else
					flag = 3;
			}

			if (flag == 1)
				result.insert(tf1.getText() + sy.getSelectedItem() + tf2.getText() + "=" + c + "\n", 0);
			else if (flag == 2)
				result.insert("0不能被整除" + "\n", 0);
			else if (flag == 3)
				result.insert("0不能被取余" + "\n", 0);
		} catch (Exception e) {
			result.insert("输入的值有误-->" + e.getMessage() + "\n", 0);
		}
	}

	public static void main(String[] args) {
		T xiao = new T("xiaoxiaoran");
		xiao.setVisible(true);
		xiao.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent arg0) {
				System.exit(0);
			}
		});
	}

}

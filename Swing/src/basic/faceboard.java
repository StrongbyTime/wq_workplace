package basic;

import javax.swing.*;

@SuppressWarnings("serial")
public class faceboard extends JFrame{
//	声明面板对象
	private JPanel face;
//	声明按钮对象
	private JButton button1;
	private JButton button2;
	public faceboard(){
		super("测试面板");
//		实例化面板对象
		face=new JPanel();
//		实例化按钮对象
		button1=new JButton("BUTTON1");
		button2=new JButton("BUTTON2");
//		将button对象加入面板中
		face.add(button1);
		face.add(button2);
//		将面板添加到窗体框架中
		this.add(face);
		this.setSize(300,100);
		this.setLocation(100, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		faceboard sp =new faceboard();
		sp.setVisible(true);
	}
}

package basic;

import javax.swing.*;

@SuppressWarnings("serial")
public class faceboard extends JFrame{
//	����������
	private JPanel face;
//	������ť����
	private JButton button1;
	private JButton button2;
	public faceboard(){
		super("�������");
//		ʵ����������
		face=new JPanel();
//		ʵ������ť����
		button1=new JButton("BUTTON1");
		button2=new JButton("BUTTON2");
//		��button������������
		face.add(button1);
		face.add(button2);
//		��������ӵ���������
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
package basic;
import javax.swing.JFrame;
public class FrameDemo extends JFrame {
	public FrameDemo(){
		super("�ҵĴ���");
		this.setSize(300,500);		//�趨���ڿ�ȣ��߶�
		this.setLocation(200,500);	//�趨�������Ͻ�����
//		�趨���ڹر�ʱ��Ĭ�ϲ���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		FrameDemo frame=new FrameDemo();
//		ʹ���ڿɼ�
		frame.setVisible(true);
	}
}

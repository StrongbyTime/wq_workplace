package basic;
import javax.swing.JFrame;
public class FrameDemo extends JFrame {
	public FrameDemo(){
		super("我的窗口");
		this.setSize(300,500);		//设定窗口宽度，高度
		this.setLocation(200,500);	//设定窗口左上角坐标
//		设定窗口关闭时的默认操作
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		FrameDemo frame=new FrameDemo();
//		使窗口可见
		frame.setVisible(true);
	}
}

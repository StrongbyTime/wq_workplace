package thread_Ex;

public class Mainthread {
	public static void main(String[] arhs){
		Thread  t=new Thread();
		Thread T=Thread.currentThread();
//		ͬ��main�߳���
		System.out.println("���߳���"+T);
		System.out.println("���߳���"+ t);
		
	}
}
package thread_Ex;

public class Mainthread {
	public static void main(String[] arhs){
		Thread  t=new Thread();
		Thread T=Thread.currentThread();
//		同属main线程组
		System.out.println("主线程是"+T);
		System.out.println("主线程是"+ t);
		
	}
}

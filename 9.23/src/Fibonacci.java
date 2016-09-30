//		斐波那契数列
public class Fibonacci {
	static int num=2178309;
	public static void main(String[] args) {
		int tem1,tem2;
		tem2=1;
		tem1=1;
		int tem;
		System.out.print(tem1+" "+tem2+" ");
		for(int i=3;;i++){
			tem=tem1+tem2;
			if(i<=20) {
				System.out.print(tem+" ");
				if(i%5==0)
					System.out.println();
			}
			if(tem==num) {
				System.out.print("该数是第"+i+"个");
				break;
			}
			if(tem>num){
				System.out.print("该数不是斐波那契数");
				break;
			}
			tem1=tem2;
			tem2=tem;
			
		}
		

	}

}

//1-1/2+1/3-1/4....
public class clac {
	public static void main(String[] args){
		int max=100;
		double sum=0;
		for(double i=1;i<=max;i++){
			if(i%2==0) sum-=1/i;
			else sum+=1/i;
			System.out.println(sum);
		}
		System.out.println(sum);
	}
}

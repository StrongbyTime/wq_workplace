package cho2;

public class ScopeVar {
	public static void main(String[] args){
		int num=2;
//		�ڲ�������num
	if(num==2){
		int num1=num*num;
		System.out.println("num��num1��ֵ�ֱ�Ϊ"+num+" "+num1);
		
	}
	System.out.println("num��ֵΪ"+num);
//	System.out.println("num1��ֵΪ"+num1);//num1������Ϊif�����
	
	}

}
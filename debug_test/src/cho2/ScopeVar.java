package cho2;

public class ScopeVar {
	public static void main(String[] args){
		int num=2;
//		内层作用域num
	if(num==2){
		int num1=num*num;
		System.out.println("num和num1的值分别为"+num+" "+num1);
		
	}
	System.out.println("num的值为"+num);
//	System.out.println("num1的值为"+num1);//num1作用域为if语句中
	
	}

}

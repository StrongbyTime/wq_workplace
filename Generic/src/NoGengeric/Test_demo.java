package NoGengeric;

import java.util.Scanner;

public class Test_demo {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		demo int_ob=new demo(new Integer(88));
		int_ob.showType();
		int i=(Integer)int_ob.getOb();
		System.out.println("value="+i);
		
		System.out.println("------------------");
		
		demo str_ob=new demo("hello world!");
		str_ob.showType();
		String s=(String)str_ob.getOb();
		System.out.println("value="+s);
		input.close();
	}
}
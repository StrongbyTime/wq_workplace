package debug_test;

import java.util.Scanner;
// ����scanner��
public class getNumber {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
//		��������
//		scan.useDelimiter("\n");
//		���÷ָ���
		System.out.println("please input two number:");
		int N1=scan.nextInt();
		int N2=scan.nextInt();
		System.out.println("N1+N2="+(N1+N2));
		System.out.println("N1-N2="+(N1-N2));
		System.out.println("N1*N2="+(N1*N2));
		System.out.println("N1/N2="+(N1/N2));
	
		
	}

}

package ch01;

import java.util.Scanner;

public class practice {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("please input three numbers:");
		/*
		 	int num1=scan.nextInt();
			int num2=scan.nextInt();
			int num3=scan.nextInt();
		 */
		boolean num1=scan.hasNextInt();
		boolean num2=scan.hasNextInt();
		boolean num3=scan.hasNextInt();
		
//		��������ݲ�����
		System.out.print(num1+" "+num2+" "+num3+" ");
//		�������
		System.out.println();
		scan.close();
	/**
	 * <h1>document</h1>
	 * @author Administrator
	 * @version 1.2.2
	 */
	}
	
}

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
		
//		仅输出数据不换行
		System.out.print(num1+" "+num2+" "+num3+" ");
//		输出换行
		System.out.println();
		scan.close();
	/**
	 * <h1>document</h1>
	 * @author Administrator
	 * @version 1.2.2
	 */
	}
	
}

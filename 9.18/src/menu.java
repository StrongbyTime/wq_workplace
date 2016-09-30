import java.util.Scanner;


public class menu {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int num=0;
		
		while(num<4){
		System.out.println("please input 1~3(1.新建 ；2.打开，3.退出):");
		num=scan.nextInt();
		
			switch(num){
				case 1:
					System.out.println("XXXXXX");
				case 3:
					System.out.println("error");
				default:
					System.out.println("go die!");
			}
		}
		scan.close();
	}
}

package cho1;
import java.util.*;
public class dataType {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
//		从控制台输入三个整数
		System.out.print("please input three numbers: ");
		int Num1=scanner.nextInt();
		int Num2=scanner.nextInt();
		int Num3=scanner.nextInt();
//		定义两个用于存储最大值和最小值的变量
		int maxNum=0;
		int minNum=0;
//	利用num1和num2进行比较找出较小的和较大的
		if(Num1>Num2){
			maxNum=Num1;
			minNum=Num2;
		}else{
			maxNum=Num2;
			minNum=Num1;
		}
//		把maxNum和minNum分别和num3进行比较，最终得出最大值和最小值
		if(maxNum<Num3){
			maxNum=Num3;
		
		}else{
			minNum=Num3;
		}
//		分别输出最大值和最小值
		System.out.println("最大值是："+maxNum+"最小值为: "+minNum);
		if(maxNum%2==0){
			System.out.println("最大值为偶数");	
		} else{
			System.out.println("最大值是奇数");
		}
		if(minNum%2==0){
			System.out.println("最小值是偶数");
		} else{
			System.out.println("最小值是奇数");
			
		}
		
		
	}
}

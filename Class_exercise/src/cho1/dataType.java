package cho1;
import java.util.*;
public class dataType {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
//		�ӿ���̨������������
		System.out.print("please input three numbers: ");
		int Num1=scanner.nextInt();
		int Num2=scanner.nextInt();
		int Num3=scanner.nextInt();
//		�����������ڴ洢���ֵ����Сֵ�ı���
		int maxNum=0;
		int minNum=0;
//	����num1��num2���бȽ��ҳ���С�ĺͽϴ��
		if(Num1>Num2){
			maxNum=Num1;
			minNum=Num2;
		}else{
			maxNum=Num2;
			minNum=Num1;
		}
//		��maxNum��minNum�ֱ��num3���бȽϣ����յó����ֵ����Сֵ
		if(maxNum<Num3){
			maxNum=Num3;
		
		}else{
			minNum=Num3;
		}
//		�ֱ�������ֵ����Сֵ
		System.out.println("���ֵ�ǣ�"+maxNum+"��СֵΪ: "+minNum);
		if(maxNum%2==0){
			System.out.println("���ֵΪż��");	
		} else{
			System.out.println("���ֵ������");
		}
		if(minNum%2==0){
			System.out.println("��Сֵ��ż��");
		} else{
			System.out.println("��Сֵ������");
			
		}
		
		
	}
}
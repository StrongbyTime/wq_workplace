import java.util.Scanner;
public class get_weight {

	
		private double height,length, width;
		
		public get_weight(double h,double l,double w) {
			this.height=h;this.length=l;this.width=w;
			}
		public void output(){
			System.out.println("���Ϊ��"+clacWeight(height, length, width));
		}
		public double clacWeight(double height,double length,double width){
			return height*length*width;
		}
		
		public static void main(String[] args){
			Scanner input=new Scanner(System.in);
			System.out.println("������߶ȣ�");
			double height=input.nextDouble();
			System.out.println("�����볤�ȣ�");
			double length=input.nextDouble();
			System.out.println("��������ȣ�");
			double width=input.nextDouble();
//			��������
			get_weight box=new get_weight(height,length,width);
			box.output();
			input.close();
		}
	
	
	

}
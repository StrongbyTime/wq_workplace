import java.util.Scanner;
public class get_weight {

	
		private double height,length, width;
		
		public get_weight(double h,double l,double w) {
			this.height=h;this.length=l;this.width=w;
			}
		public void output(){
			System.out.println("体积为："+clacWeight(height, length, width));
		}
		public double clacWeight(double height,double length,double width){
			return height*length*width;
		}
		
		public static void main(String[] args){
			Scanner input=new Scanner(System.in);
			System.out.println("请输入高度：");
			double height=input.nextDouble();
			System.out.println("请输入长度：");
			double length=input.nextDouble();
			System.out.println("请输入宽度：");
			double width=input.nextDouble();
//			创建对象
			get_weight box=new get_weight(height,length,width);
			box.output();
			input.close();
		}
	
	
	

}

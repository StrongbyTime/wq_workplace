package abstract_object1;
import java.util.Scanner;
 class circle extends Shape{
	 private double dim;
	public circle(double dim){
		super();
		this.dim=dim;
	}
	public double callArea() {
		
		return Math.PI*dim*dim;
	}

	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		System.out.println("请输入圆的半径：");
		double radius=input.nextDouble();
		circle cir1=new circle(radius);
		System.out.println("圆的面积为："+cir1.callArea());
		
		System.out.println("请输入三角形的高/长：");
		double l=input.nextDouble();
		double h=input.nextDouble();
		rectangle r1=new rectangle(h,l);
		System.out.println("三角形的面积为："+r1.callArea());
		
		System.out.println("请输入圆柱的半径/高：");
		double r=input.nextDouble();
		double height=input.nextDouble();
		cyclinder cyclin=new cyclinder(r,height);
		System.out.println("圆柱的面积为："+cyclin.callArea());
		
		input.close();
	}

	
}
 class rectangle extends Shape{
	private double length,height;
	public rectangle(double height,double length){
		super();
		this.length=length;
		this.height=height;
	}
	@Override
	public double callArea() {
		
		return length*height/2;
	}
	 
 }
class cyclinder extends Shape{
	private double height;
	private double dim;
	public cyclinder(double dim,double height){
		super();
		this.height=height;
		this.dim=dim;
	}

	public double callArea() {
		
		return Math.PI*dim*dim*2+height*Math.PI*dim*2;
	}

}

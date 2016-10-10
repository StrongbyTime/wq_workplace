import java.util.*;
public class shype{
	private double width,length;
	private double radius;

	shype(){

	}
	shype(double w,double l,double r){
		width=w;
		length=l;
		radius=r;
	}
	double area(double width,double length){
		return width*length;
	}
	double area(double radius){
		return (Math.PI)*radius*radius;
	}
	 public static void main(String[] args) {
		shype pattern=new shype();
		Scanner input=new Scanner(Syystem.in);
		pattern.width=input.nextDouble();
		pattern.length=input.nextDouble();
		pattern.radius=input.nextDouble();
		System.out.println("矩形的面积为："+pattern.area(pattern.width,pattern.length));
		System.out.println("圆形的面积为："+pattern.area(pattern.radius));
		input.close();
	}
}

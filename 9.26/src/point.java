import java.util.*;

public class point {
	private double x,y;
	public point(double x,double y){
		this.x=x;
		this.y=y;
	}
	public static void distance(point p1,point p2){
		double tem=(p1.x-p2.x)*(p1.x-p2.x)+(p1.y-p2.y)*(p1.y-p2.y);
		if(tem==0||tem==1)
		System.out.println("the distance is"+tem);
		else {
			tem=Math.sqrt(tem);
			System.out.println("the distance is"+tem);
		}
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("p1.x=");
		double p1x=input.nextDouble();
		System.out.println("p1.y=");
		double p1y=input.nextDouble();
		System.out.println("p2.x=");
		double p2x=input.nextDouble();
		System.out.println("p2.y=");
		double p2y=input.nextDouble();
		point p1=new point(p1x,p1y);
		point p2=new point(p2x,p2y);
		distance(p1,p2);
		input.close();
	}
}


public class printShype {
	public static void main(String[] args){
		int i=0;
		int h;
		
		for(h=1;h<6;h++){
			for(i=5;i>h;i--){
				System.out.print(" ");
			}
			for(i=2*h-1;i>0;i--){
				System.out.print("*");
				
			}
			System.out.println();
		}
		for(h=1;h<5;h++){
			for(i=0;i<h;i++){
				System.out.print(" ");
			} 
			for(i=2*4
					;i>2*h-1;i--){
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		
	}
}

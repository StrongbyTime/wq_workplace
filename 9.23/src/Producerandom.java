import java.util.*;

public class Producerandom {
	public static void main(String[] args){
		Random num=new Random();
		int[] arr=new int[7];
		int tem;
		boolean flag=false;
		for(int i=0;i<7;i++){
			tem=num.nextInt(30);
			while(tem==0){
				tem=num.nextInt(30);
			}
			
			while(tem!=0){
				if(i==0){
					arr[i]=tem;
				}
				for(int j=0;j<i;j++){
					
					if(tem!=arr[j]) {
						if(j>1&&(j==(i-1))) {
							flag=true;
							arr[i]=tem;
						}
						else continue;
					}
					else break;
				}
				if(flag==true) break;
				
				while(tem==0){
					tem=num.nextInt(30);
				}
			}
			System.out.print(arr[i]+" ");
		}
	}
}

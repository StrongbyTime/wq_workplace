import java.util.Scanner;
// �������
public class yangHuiSanJiao {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num;
		int[][] array=new int[17][17];
		
		System.out.println("please input a row number(2<num<17):");
		num=input.nextInt();
		
		while(num>2||num<=17){
	//		��ӡб��
			for(int i=0;i<num;i++){
				array[i][0]=1;
				array[i][i]=1;
			}
	//		��ӡ�������
			for(int i=1;i<num;i++){
				for(int j=1;j<=i;j++){
					array[i][j]=array[i-1][j]+array[i-1][j-1];
				}
			}
	//		���
			for(int i=0;i<num;i++){
				for(int j=0;j<=i;j++){
					System.out.print(array[i][j]+" ");
					if(j==i) System.out.println();
				}
			}
			break;
		}
		input.close();
	}

}

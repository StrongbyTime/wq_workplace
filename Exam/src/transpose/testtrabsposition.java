package transpose;

public class testtrabsposition {
	public static void main(String[] args){
		double[][] array={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		transposition tran=new transposition();
		System.out.println("ת��ǰ��");
		tran.showArray(array);
		System.out.println("ת�ú�");
		tran.transpose(array);
	}
}

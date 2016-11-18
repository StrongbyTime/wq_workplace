package transpose;

public class transposition {
	private double[][] array=new double[4][4];
	
	public double[][] getArray() {
		return array;
	}

	public void setArray(double[][] array) {
		this.array = array;
	}
	public void showArray(double[][] array){
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array[i].length;j++){
				System.out.print(array[i][j]+" ");
				if(j==array.length-1) 
					System.out.println();
			}
		}
	}
	public void transpose(double[][] array){
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array[i].length;j++){
				System.out.print(array[j][i]+" ");
				if(j==array.length-1) 
					System.out.println();
			}
		}
	}
}

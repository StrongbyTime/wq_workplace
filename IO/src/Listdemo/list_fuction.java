package Listdemo;
import java.io.File;

public class list_fuction {
	public static void main(String[] args){
//		�����ļ����ƴ���File����
		File file=new File("C:\\ProgramFiles\\Java\\jdk1.7.0_80");
		/**
		if(file.isDirectory()){
			String[] fileNames=file.list();
			
			for(String fileName:fileNames){
				System.out.println(fileName);
			}
		}
		**/
//		����
/**
		int array[]={1,2,5,9};
		for(int a:array){
			System.out.print(a+" ");
		}
**/
		System.out.println();
		
		if(file.isDirectory()){
			File[] files=file.listFiles();
			for(File f:files){
				if(f.isFile()){
					System.out.println("�ļ���"+f);
				}
				else{
					System.out.println("Ŀ¼��"+f);
				}
			}
		}
	}
}
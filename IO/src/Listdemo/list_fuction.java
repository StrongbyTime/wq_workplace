package Listdemo;
import java.io.File;

public class list_fuction {
	public static void main(String[] args){
//		根据文件名称创建File对象
		File file=new File("C:\\ProgramFiles\\Java\\jdk1.7.0_80");
		/**
		if(file.isDirectory()){
			String[] fileNames=file.list();
			
			for(String fileName:fileNames){
				System.out.println(fileName);
			}
		}
		**/
//		遍历
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
					System.out.println("文件："+f);
				}
				else{
					System.out.println("目录："+f);
				}
			}
		}
	}
}

package Filedemo;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;
public class File_fuction {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("�������ļ�����");
		String pathName=input.next();
//		����һ��ָ��·����file����
		File file=new File(pathName);	//��ʱ��δ�����ļ�
		
		if(!file.exists()){
			try{
				file.createNewFile();
			}
			catch(IOException e){
				//�������д�ӡ�쳣��Ϣ�ڳ����г�����λ�ü�ԭ��
				e.printStackTrace();
			}
		}
		System.out.println("�ļ��Ƿ���ڣ�"+file.exists());
		System.out.println("���ļ���"+file.isFile());	
		System.out.println("����:"+file.getName());
		System.out.println("·����"+file.getPath());
		System.out.println("����·����"+file.getAbsolutePath());
		
//		lastModified()���ص�����ʱ���1970.1.1 00:00:00֮��ĺ�����
		System.out.println("����޸�ʱ�䣺"+file.lastModified());
//		Date
		System.out.println("����޸�ʱ�䣺"+new Date(file.lastModified()));
		
		System.out.println("�ļ���С��"+file.length());
		input.close();
	}
}
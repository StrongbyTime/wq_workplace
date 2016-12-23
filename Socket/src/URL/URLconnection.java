package URL;
import java.io.*;
import java.net.*;
public class URLconnection {
	public static void main(String[] args) throws Exception{
//		����һURL����
		URL baidu=new URL("http://www.baidu.com");
//		��URL�����ȡURLconnection����
		URLConnection uc=baidu.openConnection();
//		��URLConnection��ȡ��������������BUffererReader����
		BufferedReader br=new BufferedReader(
				new InputStreamReader(uc.getInputStream()) );
		String inputLine;
		while((inputLine=br.readLine())!=null) 
			System.out.println(inputLine);
		br.close();
		System.out.println(uc.getContentType());
		System.out.println(uc.getContentLength());
		System.out.println(uc.getDate());
		System.out.println(uc.getReadTimeout());
		System.out.println(uc.getConnectTimeout());
	}
}

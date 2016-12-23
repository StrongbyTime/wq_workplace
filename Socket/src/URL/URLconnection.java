package URL;
import java.io.*;
import java.net.*;
public class URLconnection {
	public static void main(String[] args) throws Exception{
//		构建一URL对象
		URL baidu=new URL("http://www.baidu.com");
//		由URL对象获取URLconnection对象
		URLConnection uc=baidu.openConnection();
//		由URLConnection获取输入流，并构造BUffererReader对象
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

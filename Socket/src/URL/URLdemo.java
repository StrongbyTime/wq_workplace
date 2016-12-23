package URL;
import java.net.*;
import java.io.*;
public class URLdemo {

	public static void main(String[] args) throws Exception {
		URL search=new URL("http://www.baidu.com");
		BufferedReader br=new BufferedReader(new InputStreamReader(search.openStream()));
//		URL tuto=new URL(search," ");
//		System.out.println(search.getProtocol());
//		System.out.println(search.getHost());
//		System.out.println(search.getPath());
//		System.out.println(search.getFile());
//		System.out.println(search.getRef());
//		System.out.println(search.getPort());
		
		String inputLine;
		while((inputLine=br.readLine())!=null) 
			System.out.println(inputLine);
		br.close();
	}

}

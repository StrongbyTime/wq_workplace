package C_S;
import java.io.*;
import java.net.*;
public class Client {
	public static void main(String[] args){
		PrintWriter out=null;
		BufferedReader read=null;
		Socket socket=null;
		try{
			socket=new Socket("127.0.0.1",1201);
			out=new PrintWriter(socket.getOutputStream());
			
			out.println("hello! this is server!");
			out.flush();
			read=new BufferedReader(
			new InputStreamReader(socket.getInputStream()) );
			System.out.println(read.readLine());
			
		}
		catch(UnknownHostException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally{
			try{
				if(out!=null) out.close();
				if(read!=null) read.close();
				if(socket!=null) socket.close();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}

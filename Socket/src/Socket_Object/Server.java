package Socket_Object;

import java.io.IOException;
import java.net.*;

public class Server {

	public static void main(String[] args) {
		ServerSocket server=null;
		try{
			server=new ServerSocket(1230);
			
		}
		catch(IOException e){
			System.out.println("error"+e);
					
		}
		Socket Socket=null;
		try{
			Socket=server.accept();
		}
		catch(IOException e){
			System.out.println("error"+e);
		}

	}

}

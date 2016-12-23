package Socket_Object;

import java.io.IOException;
import java.net.*;

public class client {

	public static void main(String[] args) throws UnknownHostException {
		try{
			Socket socket=new Socket("127.0.0.1",1230);
			
		}
		catch(IOException e){
			e.printStackTrace();
		}

	}

}

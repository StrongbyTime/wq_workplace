package InetAddress;
import java.net.*;
public class InetAddressdemo {
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws UnknownHostException{
		InetAddress ip1= InetAddress.getLocalHost();
		System.out.println(ip1.getCanonicalHostName());
		System.out.println(ip1.getHostAddress());
		System.out.println(ip1.getHostName());
		System.out.println(ip1.getLocalHost());
		System.out.println(ip1.getLoopbackAddress());
		
		InetAddress ip2=InetAddress.getByName("www.baidu.com");
		System.out.println(ip2.getCanonicalHostName());
		System.out.println(ip2.getHostAddress());
		System.out.println(ip2.getHostName());
		
		InetAddress ip3=InetAddress.getByAddress(ip2.getAddress());
		System.out.println(ip3.getCanonicalHostName());
		System.out.println(ip3.getHostAddress());
		System.out.println(ip3.getHostName());
	}
/*1. ʹ��getLocalHost����InetAddress����

���������������getCanonicalHostName������getHostName�����õ��Ķ��Ǳ�������

����2. ʹ����������InetAddress����

��������������£�getCanonicalHostName�����Ƿ�Ҫ����DNS��������ȡ
����DNS��������ν���������������������Ҳ����˵���Ƿ��ڴ���InetAddress����
ʱ�ͽ�������������������ȷ���ˡ���ǰ���Ѿ�������ʹ����������InetAddress�����
����getHostName�����������DNS����������getCanonicalHostName�����Ͳ�һ���ˡ�
���DNS�������������йء�*/
}
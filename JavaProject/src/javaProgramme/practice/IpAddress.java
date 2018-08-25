package javaProgramme.practice;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpAddress {
	
	static void showAddress() throws UnknownHostException
	{
		 InetAddress localhost = InetAddress.getLocalHost();
	        System.out.println("System IP Address : " +
	                      (localhost.getHostAddress()).trim());
	 
	}

}

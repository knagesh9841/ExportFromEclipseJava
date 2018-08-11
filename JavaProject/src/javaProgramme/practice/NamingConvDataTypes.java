package javaProgramme.practice;

public class NamingConvDataTypes {
	
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	String str;
	boolean bool;
	
	public void showDefaultValue()
	{
		System.out.println("Byte="+b);
		System.out.println("Short="+s);
		System.out.println("Integer="+i);
		System.out.println("Long="+l);
		System.out.println("Float="+f);
		System.out.println("Double="+d);
		System.out.println("String="+str);
		System.out.println("Boolean="+bool);
		
		b = 10;
		s = 111;
		i = 1234;
		l = 123456l;
		f = 12.05f;
		d =12.12345678901;
		str = "Nagesh";
		bool = true;
		
		showSetValue();
	}

	public void showSetValue()
	{
		System.out.println("Byte="+b);
		System.out.println("Short="+s);
		System.out.println("Integer="+i);
		System.out.println("Long="+l);
		System.out.println("Float="+f);
		System.out.println("Double="+d);
		System.out.println("String="+str);
		System.out.println("Boolean="+bool);
	}
	
}

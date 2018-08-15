package javaProgramme.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class InputOutputClass {
	
	public static void inputOutput() throws IOException
	{
		int a;
		char c;
		String name;
		float f;
		boolean boolValue;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter char value = ");
		
		c = br.readLine().charAt(0);
		
		System.out.println("Char = "+c);
		
		System.out.println("Enter Int value=");
		
		a = Integer.parseInt(br.readLine());
		
		System.out.println("Int = "+a);
		
		System.out.println("Enter Float value=");
		
		f = Float.parseFloat(br.readLine());
		
		System.out.println("Float = "+f);
		
		System.out.println("Enter String value=");
		
		name = br.readLine();
		
		System.out.println("name = "+name);
		
		System.out.println("Enter Boolean value=");
		
		boolValue = Boolean.parseBoolean(br.readLine());
		
		System.out.println("Boolean = "+boolValue);
		
		name = null;
		
		System.out.println("Enter bunch of value");
		
		name = br.readLine();
		
		StringTokenizer st = new StringTokenizer(name, " ");
		
		System.out.println("Tokens are");
		
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		System.out.println("Enter bunch of value for Scanner");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(sc.next());
		
		System.out.println(sc.nextInt());
		
		System.err.println("Error Message");
		
		
	}

}

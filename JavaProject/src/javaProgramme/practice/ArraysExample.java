package javaProgramme.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArraysExample {
	
	public static void arrayExample() throws NumberFormatException, IOException
	{
		int a[]= {10,20,30,40,50};
		int b[];
		b = new int[5];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Array value=");
		
		for(int i=0;i<b.length;i++)
		{
			b[i] = Integer.parseInt(br.readLine());
		}
		
		int c[][] = new int[3][];
		
		c[0] = new int[1];
		c[1] = new int[2];
		c[2] = new int[3];
		
		System.out.println("Enter Array value for Jagged Arrays=");
		
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				c[i][j] = Integer.parseInt(br.readLine());
			}
		}
		
		System.out.println("Array A");
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("Array B");
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
		System.out.println("Array C");
		
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		System.arraycopy(a, 0, b, 0, a.length);
		
		System.out.println("Array B");
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
	}

}

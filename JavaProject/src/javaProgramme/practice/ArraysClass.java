package javaProgramme.practice;

import java.util.Arrays;

public class ArraysClass {
	
	public static void show()
	{
		int a[]= {20,40,30,10};
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Array Before Sort: "+a[i]);
		}
		
		Arrays.sort(a);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Array After Sort: "+a[i]);
		}
		
		System.out.println("Index of 10 = "+Arrays.binarySearch(a, 10));
		
		String str1 [] = {"Nagesh","Mahadev","Kadam"};
		String str2 [] = {"Nagesh","Mahadev","Kadam"};
		
		System.out.println("Two Arrays are equal = "+Arrays.equals(str1, str2));
		
		
		
	}

}

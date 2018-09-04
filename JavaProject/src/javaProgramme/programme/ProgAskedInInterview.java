package javaProgramme.programme;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ProgAskedInInterview {
	
	public void polyndromNumber(int no)
	{
		int tmp = no,rev = 0,d;
		
		
		while(tmp > 0)
		{
			d = tmp%10;
			rev = (rev*10)+d;
			tmp = tmp/10;
		}
		
		System.out.println("Reverse Number = "+rev);
		
		if(rev == no)
		{
			System.out.println(""+no+" is polyndrom Number");
		}else
		{
			System.out.println(""+no+" is not polyndrom Number");
		}
	}
	
	public void armstrongNumber(int no)
	{
		int tmp = no,rev = 0,d;
		
		while(tmp > 0)
		{
			d = tmp % 10;
			rev = (rev)+(d*d*d);
			tmp = tmp / 10;
		}
		
		System.out.println("Reverse Number = "+rev);
		
		if(rev == no)
		{
			System.out.println(""+no+" is Armstrong Number");
		}else
		{
			System.out.println(""+no+" is not Armstrong Number");
		}
		
	}
	
	public void primenumber(int no)
	{
		boolean flag = true;
		
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
			{
				flag = false;
				System.out.println(""+no+" is not prime Number");
				break;
			}
		}
		
		if(flag)
		{
			System.out.println(""+no+" is prime Number");
		}
		
	}
	
	// Fibonaci series 0, 1, 1, 2, 3, 5, 8, 13, 21
	
	public void fiboSeries()
	{
		int a = 0 , b = 1 ,c;
		
		System.out.println("Fibonaci series is");
		
		for(int i=1;i<=11;i++)
		{
			System.out.println(a);
			c = a + b;
			a = b;
			b = c;
			
		}
	}
	
	public int fact(int no)
	{
		if(no == 1)
		{
			return 1;
		}else
		{
			return no * (fact(no-1));
		}
		
	}
	
	public int power(int no,int power)
	{
		if(power==1)
			return no;
		else
			return no * power(no,(power-1));
	}
	
	public void stringReverse()
	{
		String name1 = "Nagesh";
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=(name1.length()-1);i>=0;i--)
		{
			sb.append(name1.charAt(i));
		}
		
		System.out.println("Original String = "+name1);
		System.out.println("Reverse String = "+sb);
		
	}
	
	public void firstCap()
	{
		String str = "nagesh mahadev kadam";
		
		StringBuffer sb = new StringBuffer();
		
		String st[] = str.split("\\s");
		
		for (int i = 0; i < st.length; i++) {
			
			sb.append(Character.toUpperCase(st[i].charAt(0))).append(st[i].substring(1, st[i].length())).append(" ");
		}
		
		System.out.println("Resulted String = "+sb);
		
	}
	
	public void dupArrayElement()
	{
		int arr[] = {1,3,2,1,3,4,5,5};
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate Element from array = "+arr[i]);
				}
			}
		}
	}
	
	public int binarySearch(int arr[],int first,int last,int no)
	{
		int mid = 0;
		if(first<=last)
		{

			mid = (first+last)/2;
			if(arr[mid]==no)
			{
				return mid;
			}else if(no<arr[mid])
			{
				last = mid-1;
				return binarySearch(arr, first, last, no);
			}else if(no>arr[mid])
			{
				first = mid+1;
				return binarySearch(arr, first, last, no);
			}

		}

		return -1;
	}
	
	public void bubbleSort()
	{
		int arr [] = {10,40,30,50,20,90,70,80,60,100};
		int temp;
		System.out.println("Array Before Sort is as follows");
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
		}
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("Array After Sort is as follows");
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
		}
		
	}

	
	public void collectionSort()
	{
		ArrayList<String> al = new ArrayList<>();
		al.add("Nagesh");
		al.add("Mahadev");
		al.add("Bappa");
		al.add("Kadam");
		
		Iterator<String> itr = al.iterator();
		
		System.out.println("Before Sort:");
		
		while (itr.hasNext()) {
			String string = (String) itr.next();
			System.out.println(string);
			
		}
		
		Collections.sort(al);
		
		itr = al.iterator();
		
		System.out.println("After Sort:");
		
		while (itr.hasNext()) {
			String string = (String) itr.next();
			System.out.println(string);
			
		}
	}
	
	
	public void pattern1()
	{
		System.out.println("-----Pattern 1 is as Follows-----");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	public void pattern2()
	{
		System.out.println("-----Pattern 2 is as Follows-----");
		
		for(int i=1;i<=5;i++)
		{
			
			for(int j=5;j>=i;j--)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
	
	public void pattern3()
	{
		System.out.println("-----Pattern 3 is as Follows-----");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print("  ");
			}
			
			for(int k=5;k>=i;k--)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
	
	public void pattern4()
	{
		System.out.println("-----Pattern 4 is as Follows-----");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print("  ");
			}
			
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
	
	public void pattern5()
	{
		System.out.println("-----Pattern 5 is as Follows-----");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print("  ");
			}
			
			for(int k=1;k<=i;k++)
			{
				System.out.print("*  ");
			}
			
			for(int j=5;j>i;j--)
			{
				System.out.print("  ");
			}
			
			System.out.println();
			
		}
		
	}
	
	public void pattern6()
	{
		System.out.println("-----Pattern 6 is as Follows-----");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			
			System.out.println();
		}
	}
	
	public void pattern7()
	{
		System.out.println("-----Pattern 7 is as Follows-----");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
	}
	
	public void pattern8()
	{
		System.out.println("-----Pattern 8 is as Follows-----");
		
		int no=1;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(no+" ");
				no++;
			}
			
			System.out.println();
		}
	}
	
	
}

package javaProgramme.programme;

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

}

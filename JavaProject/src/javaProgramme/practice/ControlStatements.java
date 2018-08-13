package javaProgramme.practice;

import javax.swing.SwingConstants;

public class ControlStatements {
	
	
	
	public void controlStatement()
	{
		int a = 10;

		if(a==10)
		{
			System.out.println("A = 10");
		}else
		{
			System.out.println("A is Not 10");
		}
		
		a=1;
		
		while(a<=10)
		{
			System.out.println("A="+a);
			a++;
		}
		
		a=1;
		
		do
		{
			System.out.println("A="+a);
			a++;
		}while(a<=10);
		
		a=1;
		for(;;)
		{
			System.out.println("A="+a);
			a++;
			if(a==5)
				break;
			else
				continue;
		}
		
		int arr[]= {10,20,30,40,50};
		for(int i:arr)
		{
			System.out.println("Arr"+i);
		}
		
		
		int b = 2;
		
		switch (b) {
		case 1:
			System.out.println("Case 1");
			break;
		case 2:
			System.out.println("Case 2");
			break;

		default:
			System.out.println("default Case");
			break;
		}
		
		
		String c ="Nages";
		
		switch (c) {
		case "Bappa":
			System.out.println("Bappa");
			break;
		case "Nagesh":
			System.out.println("Nagesh");
			break;
		default:
			System.out.println("Default");
			break;
		}
		
		char d='A';
		switch (d) {
		case 'B':
			System.out.println("B");
			break;
		case 'A':
			System.out.println("A");
			break;

		default:
			System.out.println("default");
			break;
		}
		
		System.out.println("Before Return statement");
		
		return;
		

	
		
	}
	

}

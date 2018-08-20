package javaProgramme.practice;

public class PolymorphismClass1 {
	
	public static void add(int a,int b)
	{
		System.out.println("Sum of two number(Static method overloading)="+(a+b));
	}
	
	public static void add(int a,int b,int c)
	{
		System.out.println("Sum of three number(Static method overloading)="+(a+b+c));
	}
	
	public void sub(int a,int b)
	{
		System.out.println("Sub of two number(Concrete method overloading)="+(a-b));
	}
	
	public void sub(int a,int b,int c)
	{
		System.out.println("Sub of three number(Concrete method overloading)="+(a-b-c));
	}
	
	public final void showData()
	{
		System.out.println("Final class");
	}

}

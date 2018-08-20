package javaProgramme.practice;

public class PolymorphismClass2 extends PolymorphismClass1{
	
	public static void add(int a,int b)
	{
		System.out.println("Sum of two number(Static method overriding Sub Class)="+(a+b));
	}
	
	public void sub(int a,int b)
	{
		System.out.println("Sub of two number(Concrete method overriding Sub Class)="+(a-b));
	}
	
}

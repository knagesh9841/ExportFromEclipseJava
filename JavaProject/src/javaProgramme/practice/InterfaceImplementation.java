package javaProgramme.practice;

public class InterfaceImplementation implements MyInterface{

	@Override
	public void publicMethod() {
		System.out.println("This implementation Method of interface");
		System.out.println("Value of Interface = "+MyInterface.x);
		
	}
	
	@Override
	public void defaultMethod()
	{
		System.out.println("This is default method of Interface implementation");
	}
	
	public void showImple()
	{
		System.out.println("This is method of Implemented class");
	}
}

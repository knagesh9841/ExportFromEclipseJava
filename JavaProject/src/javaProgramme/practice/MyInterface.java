package javaProgramme.practice;

public interface MyInterface {
	
	int x = 100;
	
	public void publicMethod();
	default void defaultMethod()
	{
		System.out.println("This is default method of Interface");
	}
	static void staticmethod() {
		System.out.println("This is Static method of Interface");
	}

}

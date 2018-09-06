package javaProgramme.practice;

public class Child extends Parent{
	
	int c;
	
	public Child(int c) {
		super(c+1);
		System.out.println("Child Constructor is called");
		this.c = c;
		
	}
	
	public void show()
	{
		super.show();
		System.out.println("Child Method is called");
		System.out.println("C = "+c);
	}
	
	public void childMethod()
	{
		System.out.println("Child Method");
	}

}

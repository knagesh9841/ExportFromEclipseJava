package javaProgramme.practice;

public class Parent extends GrandParent{
	
	int b;
	
	public Parent(int b) {
		
		super(b+1);
		System.out.println("Parent Constructor is called");
		this.b = b;
	}
	
	public void show()
	{
		super.show();
		System.out.println("Parent Method is called");
		System.out.println("B = "+b);
	}
	
	public void parentMethod()
	{
		System.out.println("Parent Method");
	}

}

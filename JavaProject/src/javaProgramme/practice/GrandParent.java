package javaProgramme.practice;

public class GrandParent {
	
	int a;
	
	public GrandParent(int a) {
		System.out.println("GrandParent Constructor is called");
		this.a = a;
	}
	
	public void show()
	{
		System.out.println("GrandParent Method is called");
		System.out.println("A = "+a);
	}
	
	public void grandParentMethod()
	{
		System.out.println("GrandParent Method");
	}

}

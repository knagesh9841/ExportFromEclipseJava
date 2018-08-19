package javaProgramme.practice;

public class AccessModifiers {
	int id = 17109;
	public String name = "Bappa Kadam";
	private float exp = 4.8f;
	protected String tech = "QA Automation";
	final int retAge;
	
	
	public AccessModifiers(int retAge)
	{
		this.retAge = retAge;
	}
	
	
	public final void finalMethodTest()
	{
		
		id +=10;
		System.out.println("Retirement Age = "+retAge);
	}

}

package javaProgramme.practice;

public class ParentClass {
	
	int id;
	public String name;
	private float exp;
	protected String tech;
	static int retAge = 58;
	final int retAgeFixed =60;
	
	
	public ParentClass(int id,String name,float exp,String tech) {
		
		this.id = id;
		this.name =name;
		this.exp = exp;
		this.tech = tech;
		
	}
	
	public void showData()
	{
		System.out.println("------Parent Details are as follows------");
		System.out.println("Id = "+id);
		System.out.println("Name = "+name);
		System.out.println("Experience = "+exp);
		System.out.println("Technology = "+tech);
	}

}

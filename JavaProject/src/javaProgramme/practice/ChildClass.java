package javaProgramme.practice;

import javaProgramme.practice.ParentClass;

public class ChildClass extends ParentClass{
	int id;
	public String name;
	private float exp;
	protected String tech;

	
	
	public ChildClass(int id, String name, float exp, String tech) {
		super(id, name, exp, tech);
		this.id = 1395;
		this.name = "Nagesh Mahadev Kadam";
		this.exp = 4.1f;
		this.tech = "QA Automation Engineer";
	}


	public void showData()
	{
		super.showData();
		System.out.println("------Child Details are as follows------");
		System.out.println("Id = "+id);
		System.out.println("Name = "+name);
		System.out.println("Experience = "+exp);
		System.out.println("Technology = "+tech);
		
		System.out.println("-----Parent Accessing using super keyword-----");
		
		System.out.println("ID = "+super.id);
		System.out.println("Name = "+super.name);
		System.out.println("Technology = "+super.tech);
		System.out.println("Retirement Age = "+super.retAge);
		System.out.println("Retirement Age fixed ="+super.retAgeFixed);
		
		
	}

}

package javaProgramme.practice;

public class CloneExample implements Cloneable{
	
	int id;
	String name;
	
	public CloneExample(int id,String name) {
		this.id = id;
		this.name = name;
	}
	
	public void showData()
	{
		System.out.println("Id = "+id);
		System.out.println("Name = "+name);
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}

}

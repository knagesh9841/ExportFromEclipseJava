package javaProgramme.practice;

public class CovariantReturnType1 {
	
	public ParentClass showData()
	{
		System.out.println("Parent Class");
		return new ParentClass(1, "Shubhangi", 1, "QA");
		
	}
}

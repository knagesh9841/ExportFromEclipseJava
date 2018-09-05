package javaProgramme.practice;

public class CovariantReturnType2 extends CovariantReturnType1{
	
	public ChildClass showData()
	{
		System.out.println("Child Class");
		return new ChildClass(2, "BaduBai", 2, "Dev");
		
	}
}

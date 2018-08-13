package javaProgramme.practice;

/**
 * This is main class which will call all the methods from here
 * 
 * @author Nagesh Kadam
 *
 */

public class MainClass {
	
	public static void callStaticMethod()
	{
		System.out.println("Static method is called");
	}

	public static void main(String[] args) {
		
		//This is first statement
		
		callStaticMethod();
		
		System.out.println("WelCome to Java Started working on practice");
		
		FirstStepTowardsJavaProgramme obj1 = new FirstStepTowardsJavaProgramme();
		obj1.show();
		
		NamingConvDataTypes obj2 = new NamingConvDataTypes();
		obj2.showDefaultValue();
		
		OperatorInJava obj3 = new OperatorInJava();
		obj3.showOperatorData();
		
		ControlStatements obj4 = new ControlStatements();
		obj4.controlStatement();
		

	}

}

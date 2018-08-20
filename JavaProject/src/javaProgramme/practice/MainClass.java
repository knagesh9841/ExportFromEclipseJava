package javaProgramme.practice;

import java.io.IOException;



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
	
	static
	{
		System.out.println("Static Block is called");
	}

	public static void main(String[] args) throws IOException, CloneNotSupportedException {
		
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
		
//		InputOutputClass.inputOutput();
		
		
		
//		ArraysExample.arrayExample();
		
		System.out.println("Command Line Argument");
		for(int i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
		}
		String name[]= {"nagesh","mahadev"};
		MainClassFromAnotherClass.main(name);
		
		StringExamples obj5 = new StringExamples();
		obj5.stringExapmles();
		
		ClassesAndObjects obj6 = new ClassesAndObjects();
		obj6.show();
		ClassesAndObjects.showStaticData();
		
		ClassesAndObjects obj7 = new ClassesAndObjects(1395,"Nagesh");
		obj7.show();
		obj7.showStaticData();
		System.out.println("Process Object");
		obj7.processObject(obj7);
		obj7.show();
		
		new ClassesAndObjects().ArrayCaller();
		
		Two obj8 = new Two(new One(100),200);
		obj8.show();
		
		ChildClass obj9 = new ChildClass(17109, "Nagesh Kadam", 3.7f, "Senior Software Engineer");
		
		obj9.showData();
		
		AccessModifiers obj10 = new AccessModifiers(58);
		
		System.out.println("Default members in same Directory = "+obj10.id);
		System.out.println("Public members in same directory = "+obj10.name);
		System.out.println("Private member cannnot be accessed in same Directory");
		System.out.println("Protected member in same directory  = "+obj10.tech);
	
		obj10.finalMethodTest();
		
		PolymorphismClass1 obj11 = new PolymorphismClass1();
		
		obj11.add(100, 100);
		obj11.add(100, 1000, 10);
		PolymorphismClass1.add(1, 2);
		PolymorphismClass1.add(1, 2, 3);
		obj11.sub(100, 80);
		obj11.sub(1000, 100, 10);
		
		PolymorphismClass2 obj12 = new PolymorphismClass2();
		
		obj12.add(10, 20);
		PolymorphismClass2.add(100, 200);
		obj12.sub(111, 222);
		obj12.showData();
		
		PolymorphismClass1 obj13 = new PolymorphismClass2();
		obj13.add(1111, 2222);
		
		CloneExample obj14 = new CloneExample(1395,"Bappa");
		CloneExample obj15 = (CloneExample) obj14.clone();
		obj14.showData();
		obj15.showData();
		
	
	
		
	}

}

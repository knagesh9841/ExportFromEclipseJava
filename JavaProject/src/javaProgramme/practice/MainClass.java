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

	public static void main(String[] args) throws Exception {
		
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
		System.out.println("Static method");
		obj12.add(10, 20);
		PolymorphismClass2.add(100, 200);
		obj12.sub(111, 222);
		obj12.showData();
		
		PolymorphismClass1 obj13 = new PolymorphismClass2();
		System.out.println("Static method Test");
		obj13.add(1111, 2222);
		PolymorphismClass2.add(11111, 222222);
		
		CloneExample obj14 = new CloneExample(1395,"Bappa");
		CloneExample obj15 = (CloneExample) obj14.clone();
		obj14.showData();
		obj15.showData();
		
		Class classname = obj15.getClass();
		System.out.println("Class Name = "+classname.getSimpleName());
		
		Car obj16 = new MarutiSuzuki(5, "Nexa");
		obj16.showCarName();
		obj16.showSuperData();
		
	
		MarutiSuzuki obj17 = new MarutiSuzuki(6, "SX4");
		obj17.showCarName();
		obj17.showSuperData();
		obj17.showMaruti();
		
		MyInterface obj18 = new InterfaceImplementation();
		obj18.defaultMethod();
		obj18.publicMethod();
		MyInterface.staticmethod();
		
		InterfaceImplementation obj19 = new InterfaceImplementation();
		obj19.defaultMethod();
		
		SingleAbstractedClass obj20 = new SingleAbstractedClass();
		obj20.show();
		System.out.println(obj20.hashCode());
		
		ExceptionHandling obj21 =new ExceptionHandling();
		try {
			obj21.cal();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Rethrown Exception is "+e.getMessage());
			e.printStackTrace();
		}
		
		obj21.show();
		
		/*FileReadWrite obj22 = new FileReadWrite("testfile.txt");
		
		obj22.writeFile();
		obj22.readfile();
		obj22.fileOperation();*/
		
		/*IpAddress.showAddress();
		
		Thread t = Thread.currentThread();
		System.out.println("Thread info = "+ t);
		System.out.println("Thread start = "+t.getName());
		
		SingleTaskThread obj23 = new SingleTaskThread();
		Thread t1 = new Thread(obj23);
		MultileTaskThread obj24 = new MultileTaskThread();
		Thread t2 = new Thread(obj24);
		
		t1.start();
		t2.start();
		
		ThreadSynchronization obj25 = new ThreadSynchronization(1);
		
		Thread t3 = new Thread(obj25);
		Thread t4 = new Thread(obj25);
		
		t3.setName("First Person");
		t4.setName("Second Person");
		
		t3.start();
		t4.start();
		
		Producer prod = new Producer();
		Consumer cons = new Consumer(prod);
		
		Thread t5 = new Thread(prod);
		Thread t6 = new Thread(cons);
		
		t6.start();
		t5.start();

		JdbcConnectionOracle.showData("Oracle");
		JdbcConnectionOracle.showData("SQL");*/
		
		CollectionPractice.setExample();
		CollectionPractice.listExample();
		
		ArraysClass.show();
		
		DateCalenderClass.show();
		
		DateCalenderClass obj26[] = new DateCalenderClass[5];
		
		for(int i=0;i<obj26.length;i++)
		{
			obj26[i] = new DateCalenderClass();
			System.out.println("Object created");
		}
		
		Javanewfeatures.show();
		
		JavaDateTimeAPI.show();
		
		CovariantReturnType1 obj27 = new CovariantReturnType1();
		
		obj27.showData();
		
		CovariantReturnType2 obj28 = new CovariantReturnType2();
		
		obj28.showData();
		
		CovariantReturnType1 obj29 = new CovariantReturnType2();
		
		obj29.showData();
		
		Child obj30 = new Child(100);
		
		obj30.show();
		obj30.grandParentMethod();
		obj30.parentMethod();
		obj30.childMethod();
		
	}

}

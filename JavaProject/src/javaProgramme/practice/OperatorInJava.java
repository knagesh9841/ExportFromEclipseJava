package javaProgramme.practice;

public class OperatorInJava {
	
	int x=100,y=20;
	
	public void showOperatorData()
	{
		// Arithmetic operator
		
		System.out.println("Arithmetic Operator");
		System.out.println("x+y = "+(x+y));
		System.out.println("x-y = "+(x-y));
		System.out.println("x*y = "+(x*y));
		System.out.println("x/y = "+(x/y));
		System.out.println("x%y = "+(x%y));
		
		//Unary Operator
		System.out.println("Unary Operator");
		System.out.println("(-x) = "+(-x));
		System.out.println("x++ = "+(x++));
		System.out.println("++y = "+(++y));
		
		// Relation Operator
		
		System.out.println("Relational Operator");
		
		System.out.println("x>y = "+(x>y));
		System.out.println("x>=y = "+(x>=y));
		System.out.println("x<y = "+(x<y));
		System.out.println("x<=y = "+(x<=y));
		System.out.println("x==y = "+(x==y));
		System.out.println("x!=y = "+(x!=y));
		
		
		// Logical Operator
		
		System.out.println("Logical operator");
		System.out.println("true && false = "+((10==10) && (11==10)));
		System.out.println("true || true = "+((10==10) || (11==10)));
		System.out.println("!true = "+(!(11==10)));
		
		// Boolean operators
		
		System.out.println("Boolean operator");
		
		System.out.println("true & true = "+(true & true));
		System.out.println("true | true = "+(true | true));
		System.out.println("!true = "+(!true));
		
		// ternary/Conditional Operator
		
		int max = (10==10)?x:y;
		
		System.out.println("Conditional Operator = "+max);
		
		
		
		
	}
	

}

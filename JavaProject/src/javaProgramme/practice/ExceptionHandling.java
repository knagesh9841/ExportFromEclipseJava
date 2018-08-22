package javaProgramme.practice;

public class ExceptionHandling {
	
	int a = 10;
	
	public void cal()
	{
		try {
			int res = a/0;
		} catch (ArithmeticException e) {
			System.out.println("Exception caught is "+e.getMessage());
			e.printStackTrace();
			throw e;
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception caught is "+e.getMessage());
			e.printStackTrace();
			throw e;
		}finally {
			System.out.println("Finally block called");
		}
		
	}
	
	public void show()	{
		System.out.println("Throws Exception is called");
	}

}

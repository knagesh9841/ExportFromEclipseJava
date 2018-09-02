package javaProgramme.programme;

public class MainClassPrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProgAskedInInterview obj =new ProgAskedInInterview();
		obj.polyndromNumber(121);
		obj.armstrongNumber(153);
		obj.primenumber(4);
		obj.fiboSeries();
		System.out.println("Factorial of 3 = "+obj.fact(3));
		System.out.println("2 power 5 = "+obj.power(4, 5));
		obj.stringReverse();
		obj.firstCap();
		obj.dupArrayElement();
	}

}

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
		
		int arr[] = {10,20,30,40,50,60,70,80,90,100};
		
		int pos = obj.binarySearch(arr, 0, arr.length-1, 20);
		if(pos==-1)
			System.out.println("Element is not Found");
		else
			System.out.println("Element Found at Location: "+pos);
		
		
		obj.bubbleSort();
		
		obj.collectionSort();
	}

}

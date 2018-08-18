package javaProgramme.practice;

public class ClassesAndObjects {
	
	int age;
	String name;
	static String comp = "XPANXION";
	
	public ClassesAndObjects() {
		age = 18;
		name = "Bappa";
	}
	
	public ClassesAndObjects(int age,String name)
	{
		this.age = age;
		this.name = name;
	}
	
	void show()
	{
		System.out.println("Age = "+this.age);
		System.out.println("Name = "+this.name);
		System.out.println("Company name = "+this.comp);
		this.callNormalMethod(1,2);
		
	}
	
	static void showStaticData()
	{
		System.out.println("Company Name = "+comp);
	}
	
	void callNormalMethod(int ...a)
	{
		System.out.println("Successfully called method using this");
		
		if(a.length>0)
		{
			for(int i=0;i<a.length;i++)
				System.out.println(a[i]);
		}
	}
	
	void ArrayCaller()
	{
		int arr[]= {10,20,30,40,50};
		
		this.arrayCalled(arr);
		
		System.out.println("Array Element are as follows");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	void arrayCalled(int []arr)
	{
		System.out.println("Array Element are as follows");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = i;
		}
		
		
	}
	
	ClassesAndObjects processObject(ClassesAndObjects obj)
	{
		obj.age = 1234;
		obj.name = "Nagesh Mahadev Kadam";
		
		return obj;
	}
	

}

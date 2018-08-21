package javaProgramme.practice;

public abstract class Car {
	
	int engNo;
	String carModel;
	
	public Car(int engNo,String carModel) {
		
		this.engNo = engNo;
		this.carModel = carModel;
	}
	
	public void showSuperData()
	{
		System.out.println("Engine No = "+engNo);
		System.out.println("Car Model = "+carModel);
	}
	
	public abstract void showCarName();
}

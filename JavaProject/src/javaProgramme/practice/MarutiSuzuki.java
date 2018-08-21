package javaProgramme.practice;

public class MarutiSuzuki extends Car{
	
	public MarutiSuzuki(int engNo,String carModel) {
		super(engNo,carModel);
			}
	
	@Override
	public
	 void showCarName()
	{
		System.out.println("This is maruti Car Implemented method");
	}
	
	public void showMaruti()
	{
		System.out.println("this is Maruti Car method");
	}

}

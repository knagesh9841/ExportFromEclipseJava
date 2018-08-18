package javaProgramme.practice;

public class Two {
	One oneObj;
	int twoVar;
	
	public Two(One oneObj,int twoVar) {
	
		this.oneObj = oneObj;
		this.twoVar = twoVar;
	}
	
	void show()
	{
		System.out.println("Two Obj Variable = "+twoVar);
		oneObj.show();
	}

}

package javaProgramme.accessModifiers;
import javaProgramme.practice.AccessModifiers;

public class AccessModifiersVerifyInDiffPack extends AccessModifiers{
	

	public AccessModifiersVerifyInDiffPack(int retAge) {
		super(retAge);
		// TODO Auto-generated constructor stub
	}

	public void show()
	{
		
		System.out.println("Protected Cannot be accesed outside of directory but they can be accessed using Inheritence = "+tech);
	}

	public static void main(String args[])
	{
		AccessModifiersVerifyInDiffPack obj1 = new AccessModifiersVerifyInDiffPack(58);
		AccessModifiers obj2 = new AccessModifiers(58);
		System.out.println("Default cannot be accessed outside Directory");
		System.out.println("Public outside of Directory ="+obj2.name);
		System.out.println("Private cannot be accessed outside of directory");
		obj1.show();
	}

}

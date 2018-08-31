package javaProgramme.practice;

import java.util.ArrayList;

public class Javanewfeatures {
	
	static public void show()
	{
		ArrayList<String> al = new ArrayList<>();
		
		al.add("Nagesh");
		al.add("Bappa");
		al.add("Kadam");
		
		al.forEach(name ->System.out.println(name));
	}

}

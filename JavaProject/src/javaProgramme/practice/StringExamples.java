package javaProgramme.practice;

public class StringExamples {
	
	public void stringExapmles()
	{
		String name = "Nagesh Mahadev Kadam";
		
		System.out.println("Concat = "+name.concat(" Wanjarkheda TQ&Dist: Latur"));
		
		System.out.println("Length = "+name.length());
		
		System.out.println("CharAt = "+name.charAt(0));
		
		System.out.println("CompareTo = "+name.compareTo("Nagesh Mahadev Kadam"));
		
		System.out.println("CompareToIgnoreCase = "+name.compareToIgnoreCase("nagesh mahadev kadam"));
		
		System.out.println("Equals = "+name.equals("Nagesh Mahadev Kadam"));
		
		System.out.println("EqualsIgnoreCase = "+name.equalsIgnoreCase("nagesh mahadev kadam"));
		
		System.out.println("StartsWith = "+name.startsWith("Nag"));
		
		System.out.println("Endswith = "+name.endsWith("dam"));
		
		System.out.println("Indexof = "+name.indexOf("a"));
		
		System.out.println("lastIndexOf = "+name.lastIndexOf("a"));
		
		System.out.println("Replace = "+name.replace('a', 'A'));
		
		System.out.println("REeplaceString = "+name.replaceAll("Nagesh", "Bappa"));
		
		System.out.println("Substring = "+name.substring(5));
		
		System.out.println("Substring FL = "+name.substring(5, 10));
		
		System.out.println("Uppercase = "+name.toUpperCase());
		
		System.out.println("Lower case = "+name.toLowerCase());
		
		System.out.println("Trim = "+name.trim());
		
		String []arr = name.split("\\s");
		
		System.out.println("Contains = "+name.contains("Nagesh"));
		
		for(int i=0;i<arr.length;i++)
			System.out.println("Split = "+arr[i]);
		
		StringBuffer sb = new StringBuffer();
		System.out.println("Initial = "+sb);
		
		System.out.println("NextAppend = "+sb.append("Nagesh"));
		
		System.out.println("NextNextAppend = "+sb.append(" Bappa"));
		
		System.out.println("insert = "+sb.insert(6, " Mahadev Kadam"));
		
		
		System.out.println("reverse = "+sb.reverse());
		
		System.out.println("reverse = "+sb.reverse());
		
		
		System.out.println("Substring = "+sb.substring(0,6));
		
		
		System.out.println("Delete = "+sb.delete(0, 3));
		
		System.out.println("Replace = "+sb.replace(0, 2, "Nagu"));
		
		
	
		
	}

}

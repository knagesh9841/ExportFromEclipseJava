package javaProgramme.practice;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionPractice {
	
	static public void setExample()
	{
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Nagesh");
		hs.add("Mahadev");
		hs.add("Kadam");
		hs.add("Kadam");
		hs.add(null);
		hs.add(null);
		
		System.out.println("Size of Set = "+hs.size());
		System.out.println("Set is Empty? = "+hs.isEmpty());
		
		
		Iterator<String> itr = hs.iterator();
		
		
		while (itr.hasNext()) {
			
			System.out.println("Set Value = "+itr.next());
			
		}
		
		System.out.println("Removing Kadam :- "+hs.remove("Kadam"));
		
		for(String str:hs)
		{
			System.out.println("Set value after remove = "+str);
		}
		
	
		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		
		lhs.add("Bappa");
		lhs.add("Mahadev");
		lhs.add("Kadam");
	
		 itr =  lhs.iterator();
		
		while (itr.hasNext()) {
			System.out.println("LinkedHashset = "+itr.next());
			
		}
		
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("Nagesh");
		ts.add("Mahadev");
		ts.add("Kadam");
		
		
		itr = ts.iterator();
		
		while (itr.hasNext()) {
			System.out.println("treeset = "+itr.next());
			
		}
		
		TreeSet<String> ts1 = new TreeSet<String>();
		ts1.addAll(lhs);
		
		itr = ts1.iterator();
		
		while (itr.hasNext()) {
			System.out.println("treeset AddAll = "+itr.next());
			
		}
		
	}
	
	static public void listExample()
	{
		Stack<String> st = new Stack<String>();
		
		st.push("Kadam");
		st.push("Mahadev");
		st.push("Nagesh");
		
		Iterator<String> itr = st.iterator();
		
		System.out.println("Top Most Element = "+st.peek());
		
		//System.out.println("Top Most Element = "+st.pop());
		
		while (itr.hasNext()) {
			System.out.println("Stack = "+itr.next());
			
		}
		
		System.out.println("Nagesh Index = "+st.search("Kadam"));
		
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Nagesh");
		al.add("Mahadev");
		al.add("Kadam");
		
		ListIterator<String> litr = al.listIterator();
		
		while (litr.hasNext()) {

			System.out.println("ArrayList "+ litr.next());
			
		}
		
		while (litr.hasPrevious()) {

			System.out.println("ArrayList "+ litr.previous());
			
		}
		
		al.add(0, "Bappa");
		
		litr = al.listIterator();
		
		while (litr.hasNext()) {

			System.out.println("ArrayList "+ litr.next());
			
		}
		
		al.set(0, "NageshBappa");
		al.remove(1);
		
		litr = al.listIterator();
		
		while (litr.hasNext()) {

			System.out.println("ArrayList "+ litr.next());
			
		}
		
		System.out.println("Element @0 Index = "+al.get(0));
		System.out.println("Size of Arraylist = "+al.size());
		System.out.println("Arralist Contains = "+al.contains("Kadam"));
		
		Vector<String> vc = new Vector<String>();
		vc.add("Nagesh");
		vc.add("Bappa");
		vc.add("Kadam");
		
		Enumeration<String> en = vc.elements();
		
		while (en.hasMoreElements()) {
			System.out.println("Vector = "+en.nextElement());
			
		}
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(null, null);
	
		hm.put(1, "One");
		hm.put(2, "Two");
		hm.put(3,null);
		hm.put(4,"Two");
		
		Set<Integer> set = new HashSet<Integer>();
		
		set = hm.keySet();
		
		Iterator<Integer> ir = set.iterator();
		
		while (ir.hasNext()) {
			Integer key = ir.next();
			System.out.println("HashMap Key : Value = "+(key+":"+hm.get(key)));
			
		}
		
		
		Hashtable<Integer, String> ht = new Hashtable<Integer,String>();
		
		
		ht.put(1, "One");
		ht.put(2, "Two");
		ht.put(3, "Two");
		
		Enumeration<Integer> enu = ht.keys();
		
		while (enu.hasMoreElements()) {
			Integer integer = (Integer) enu.nextElement();
			
			System.out.println("HashTable Key:Value = "+(integer+":"+ht.get(integer)));
			
		}
		
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
		
		lhm.put(null, null);
		lhm.put(1, "One");
		lhm.put(2, "Two");
		lhm.put(3, "Three");
		
		set = lhm.keySet();
		
		ir = set.iterator();
		
		while (ir.hasNext()) {
			Integer key = ir.next();
			System.out.println("LinkedHashmap Key : Value = "+(key+":"+lhm.get(key)));
			
		}
		
	}

}

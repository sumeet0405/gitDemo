package Java_Utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
public static void main(String[] args) {
	
	ArrayList al=new ArrayList<>();
	al.add("sumit");
	al.add("Raj");
	al.add("Akshay");
	
	HashSet hs=new HashSet();
	hs.addAll(al);
	hs.add(10);
	hs.add(20);
	hs.add(30);
	hs.add(40);
	//hs.clear();// clear hashSet
	System.out.println(hs.contains("Raj"));
	System.out.println(hs.contains("jagdish"));
	System.out.println(hs);

	hs.remove("Akshay");// it will remove akshay from hashSet
	
	
//	hs.add("sumit");
//	hs.add(100);
//	hs.add(true);
//	hs.add(11.55);
	
	//HashSet does not follows the sorting order
	System.out.println(hs);

	//it will return size of hashSet
	System.out.println(hs.size());

	
	//HashSet 
//	Iterator itr=hs.iterator();
//	while(itr.hasNext()) {
//		System.out.println(itr.next());
//	}
	
}
}

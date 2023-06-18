package Java_Utils;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
public static void main(String[] args) {
	
	
	ArrayList al2=new ArrayList();
	al2.add(10);
	al2.add(20);
	al2.add(30);
	al2.add( 40);
	al2.add( 50);
	al2.add("sumit");
	
	
	
	ArrayList al3=new ArrayList();
	al3.add("sumit");
	al3.add("raj");
	
//	al2.addAll(al3);
//	System.out.println(al2);
//	al2.remove(1);
//	System.out.println(al2);

//	al2.remove("raj");
//	System.out.println(al2);
	
//	System.out.println(al2);
//	System.out.println(al3);
//	al2.removeAll(al3);// it will remove common elements from al2
//	System.out.println(al2);
//	System.out.println(al3);
	
//	al2.clear();
//	System.out.println(al2);
	
//	System.out.println(al2.contains("sumit"));//object present or not
//	System.out.println(al2.contains("raj"));// it will check raj is present or not in al2
//	
	
//	System.out.println(al2.size());//how many elements are present in Arraylist
	
	
//	System.out.println(al2.get(5));// it will return sumit based on int index	
	
	
//	System.out.println(al2.set(4, 555));
//	System.out.println(al2);
	
//	System.out.println(al2.indexOf("sumit"));// 5 index position
//	System.out.println(al2.indexOf(10));// 0 index position
	
	Iterator itr2=al2.iterator();
	while(itr2.hasNext()) {
		System.out.println(itr2.next());
	}
	
}
}

package Java_Utils;

import java.util.Vector;

public class VectorDemo {
public static void main(String[] args) {
	
	Vector v=new Vector(); // initial capacity is 10
	v.add("sumit");
	v.add(1, "raj");
	v.add(123);
	v.add(12.45);
	v.add('G');
	
	//duplicates are allowed
	v.add("sumit");
	
	
	// we can add multiple null values
	v.add(null);
	v.add(null);
	
//	System.out.println(v.firstElement());
//	System.out.println(v.lastElement());
//	System.out.println(v);
//	
//	// remove specific value
//	System.out.println(v.removeElement("raj"));
	
	// remove element based on index position
	System.out.println(v); //[sumit, raj, 123, 12.45, G, sumit, null, null]
	v.removeElementAt(2);
	System.out.println(v);//[sumit, raj, 12.45, G, sumit, null, null]
	
//	//remove all elements
//	v.removeAllElements();
//	System.out.println(v);
//	
	
	// to find out capacity of element max capacity it will return
	System.out.println(v.capacity());
	
	//replace element with new one
	v.setElementAt("jagadish", 1);
	System.out.println(v);
}
}

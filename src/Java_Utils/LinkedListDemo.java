package Java_Utils;

import java.util.LinkedList;

public class LinkedListDemo {
public static void main(String[] args) {
	
	LinkedList li=new LinkedList();
	li.add("sumit");
	li.add("akashay");
	li.add(555);
	li.add(124.7);
	
	//duplicates can allowed
	li.add("sumit");
	
	// multiple null values can be allowed
	li.add(null);
	li.add(null);
	li.add(null);
	
	//it follows the insertion order
	
	
	// it does not follows sorting order
	li.add(50);
	li.add(10);
	li.add(55);
	
	
	//linkedList are non synchronized
	//it having only concreate methods
	
	System.out.println(li);
	
	
}
}

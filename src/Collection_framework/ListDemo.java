package Collection_framework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class ListDemo{
public static void main(String[] args) {
	
	List l=new ArrayList();
	l.add(10);
	l.add(1,20);
	//l.add(5,30);// index out of bound exception becoz before this index are empty places 
	l.add(40);// it will automatic loacate index position
	
	//duplicate allows
	l.add(10);
	
	//list allows multiple "null" values
	l.add(null);
	l.add(null);
	//System.out.println(l);

	//to retrieve values we use iterator
//	Iterator itr=l.iterator();
//	while(itr.hasNext()) {
//		System.out.println(itr.next());
//	}
	
	// we can retrive values using List iterator also 
	// using List iterator we can go next as well as go previous is possible
	ListIterator litr=l.listIterator();
	while(litr.hasNext()) {
		System.out.println(litr.next());
	}
	
	
}
}

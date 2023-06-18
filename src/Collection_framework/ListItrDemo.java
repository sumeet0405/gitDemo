package Collection_framework;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListItrDemo {

	public static void main(String[] args) {

		
		List l=new ArrayList();
		l.add(10);
		l.add("sumit");
		l.add("jagadish");
		
	ListIterator litr=	l.listIterator();
	
//	while(litr.hasNext()) {
//		System.out.println(litr.next());
//	}
//	
//	System.out.println("==============================");  
	
	
	litr.next();
	litr.next();
	
	while(litr.hasPrevious()) {
		System.out.println(litr.previous());
	}
	
//	litr.add(100);
//	System.out.println(l);
	
//	litr.set(200);
	System.out.println(l);
	
	litr.remove();
	System.out.println(l);
	
	
	}

}

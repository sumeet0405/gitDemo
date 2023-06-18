package Collection_framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ItrDemo {

	public static void main(String[] args) {
		
		
		List l=new ArrayList();
		l.add(10);
		l.add("sumit");
		l.add("raj");
		
		Iterator itr=l.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		l.remove("raj");
		System.out.println(l);
		
	}

}

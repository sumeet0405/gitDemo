package Collection_framework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
public static void main(String[] args) {
	
	Set s=new HashSet();
	s.add(100);
	s.add(200);
	s.add(300);
	s.add(400);
    //System.out.println(s);// insertion order is not preserved [400, 100, 200, 300]
	
	//duplicates not allowed
	s.add(100);
	//System.out.println(s);// it will print 100 value only once
	
	//set allows "null" value only once
	s.add(null);
	s.add(null);
	//System.out.println(s);// it print null only once [400, null, 100, 200, 300]

	//to retrive values one by one using iterator
	Iterator itr=s.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
}
}
}

package Collection_framework;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
public static void main(String[] args) {
	
	Vector v=new Vector();
	v.add(10);
	v.add("sumit");
	v.add(15.2);

	//System.out.println(v);
	
	Enumeration e=v.elements();
	while(e.hasMoreElements()) {
		System.out.println(e.nextElement());
	}
	
}
}

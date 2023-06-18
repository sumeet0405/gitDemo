package Java_Utils;

import java.util.TreeSet;

public class TreeSetDemo {
public static void main(String[] args) {
	// we can store only homogeneous data
	
	TreeSet ts= new TreeSet();
//	ts.add(40);
//	ts.add(60);
//	ts.add(20);
//	ts.add(30);
//	ts.add(50);
//	ts.add(10);
	
	ts.add("akshay");
	ts.add("vinay");
	ts.add("suraj");
	ts.add("sumit");
	ts.add("raj");
	
	//ts.add(null); ---- we cannot insert null value
	System.out.println(ts);// print element in sorted order
	
	
	
}
}

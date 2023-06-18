package Collection_framework;

import java.util.ArrayList;
import java.util.Collection;
public class Test {
public static void main(String[] args) {
	
	ArrayList al=new ArrayList();
	al.add(100);
	al.add(200);
	al.add(300);
		
	System.out.println(al);
	
	ArrayList al2=new ArrayList();
	al2.add("aaa");
	al2.add("bbb");
	al2.add("ccc");
	
	System.out.println(al2);
	
	al.addAll(al2);
	System.out.println(al);
	
	System.out.println(al.contains("ccc"));
	System.out.println(al.contains("ggg"));
	System.out.println(al.isEmpty());
	System.out.println(al.size());
	System.out.println(al2.size());
	System.out.println(al.remove("aaa"));
	System.out.println(al.remove(0));// pass index position 
	
	
	System.out.println(al);
	System.out.println(al2);
	al.removeAll(al2);
	System.out.println("after remove all al-"+al);
	System.out.println("after remove all al2-"+al2);

	
	al.clear();
	System.out.println("after performe clear al-"+al);
}
}

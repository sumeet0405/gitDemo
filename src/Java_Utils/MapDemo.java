package Java_Utils;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
public static void main(String[] args) {
	
	
	Map mp=new HashMap();
	mp.put(101, "sumit");
	mp.put(102, "Raj");
	mp.put(103, "Akshay");
	
	//to delete map
	//mp.clear();
	
	System.out.println(mp.containsKey(103));//true
	System.out.println(mp.containsValue("Raj"));//true
	
	System.out.println(mp.get(103));// it display value according to key
	
	System.out.println(mp.isEmpty());
	
	//mp.remove(102);// it romove raj and key
	mp.replace(103, "AK");
	
	System.out.println(mp.size());//3
	
	mp.put(102, "ravi");//it will replace the Raj with ravi
	
	mp.put(null, null);
	//mp.put(null, "aaa");// it will replace value becoz key accept only one null 
	mp.put(104, null);
	
	// it display data inside curly braces key & value pair
	System.out.println(mp);
}
}

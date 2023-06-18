package Java_Utils;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(100, "ramesh");
		hm.put(102, "amit");
		hm.put(103, "aniket");
		hm.put(104, "dj");

		// System.out.println(hm);// {100=ramesh, 102=amit, 103=aniket, 104=dj}

//old way to print key and value ceprately	
//	Set set=hm.entrySet();
//	System.out.println(set);// [100=ramesh, 102=amit, 103=aniket, 104=dj]
//	Iterator itr=set.iterator();
//	while(itr.hasNext()) {
//		Map.Entry entry=(Map.Entry)itr.next();
//		//System.out.println(itr.next());
//	System.out.println(entry.getKey()+"---->"+entry.getValue());

		// enhance for loop we can also print values & keys separately
//	for(Map.Entry me: hm.entrySet()) {
//		System.out.println(me.getKey()+"--->>> "+me.getValue());
//	}

		// HashMap does not follow insertion & sorting oder
		hm.put(null, "aaa");

		// null values accept only one in key
		hm.put(null, "bbb");

		hm.put(106, null);
		hm.put(107, null);
		System.out.println(hm);

		hm.remove(101);// ramesh removed

		System.out.println(hm.containsKey(106));// true
		System.out.println(hm.containsKey(110));// false

		System.out.println(hm.containsValue("dj"));// true
		System.out.println(hm.containsValue("raaaaaj"));// false

		
		System.out.println(hm.get(103));//aniket
		System.out.println(hm.get(110));// no present element null
		System.out.println(hm.isEmpty());//false
		System.out.println(hm);
		System.out.println(hm.size());//7
		
		//
		
	}
}

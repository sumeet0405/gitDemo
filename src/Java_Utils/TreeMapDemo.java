package Java_Utils;

import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		// By default treeMap having its sorting order
		// But if we want to provide your own sorting order
		TreeMap tm = new TreeMap();

		tm.put(105, "sumit");
		tm.put(106, "amit");
		tm.put(107, "raj");
		tm.put(101, "Akshay");
		tm.put(102, "ravi");
		tm.put(104, "rohit");
		// output in sorting order in ----> key
		System.out.println(tm);// {101=Akshay, 102=ravi, 104=rohit, 105=sumit, 106=amit, 107=raj}

		// ceilingEntry method returen value
		System.out.println(tm.ceilingEntry(105));// sumit
		System.out.println(tm.ceilingEntry(103));// 103 is not present
		// but it will return after that key value -->rohit

		// ceilingKey method return Key only
		System.out.println(tm.ceilingKey(105));// 105
		System.out.println(tm.ceilingKey(103));// 104

		System.out.println(tm.containsKey(105));// true
		System.out.println(tm.containsKey(103));// false

		System.out.println(tm.firstEntry());// 101=Akshay
		System.out.println(tm.firstKey());// 101

		System.out.println(tm.floorEntry(107));// 107=raj
		System.out.println(tm.floorEntry(103));// 102=ravi

		System.out.println(tm.get(105));// sumit
		System.out.println(tm.get(103));// null

		System.out.println(tm.headMap(102));// {101=Akshay}

		System.out.println(tm.higherEntry(102));// 104=rohit
		System.out.println(tm.higherEntry(105));//106=amit

		System.out.println(tm.keySet());//[101, 102, 104, 105, 106, 107]

		System.out.println(tm.pollFirstEntry());// it remove first entry and return
		System.out.println(tm);
		
		System.out.println(tm.pollLastEntry());// it remove last entry
		System.out.println(tm);

		System.out.println(tm.subMap(102, 105));//{102=ravi, 104=rohit}

		
//	tm.put("sumit",105);
//	tm.put("amit",106);
//	tm.put("raj",107);
//	tm.put("Akshay",101);
//	tm.put("ravi",102);
//	tm.put("rohit",104);
//	//output in sorting oder----> Value
//	System.out.println(tm);//{Akshay=101, amit=106, raj=107, ravi=102, rohit=104, sumit=105}

	}
}

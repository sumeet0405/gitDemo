package IMP_Programes;

import java.util.LinkedHashMap;

public class Occurance_of_dup_char_from_String {
	public static int count;

	public static void main(String[] args) {
		String name = "school sumitt shinde";
		char a[] = name.toCharArray();
		LinkedHashMap map = new LinkedHashMap();
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
			map.put(a[i], count);
		}
		System.out.println(map);

//		String a1 = "sschool";
//		char abc[] = a1.toCharArray();
//		int count;
//		for (int i = 0; i < abc.length; i++) {
//			count = 1;
//			for (int j = i + 1; j < abc.length; j++) {
//				if (abc[i] == abc[j] && abc[i] != ' ') {
//					count++;
//					abc[j] = '0';
//				}
//			}
//			if (count >= 1 && abc[i] != '0') {
//				System.out.println(abc[i] + " " + count + ",");
////				System.out.println();
//			}
//		}

	}

}

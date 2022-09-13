package ch13.lecture.p05wildcard;

import java.util.ArrayList;

public class C03WildCard {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("maverick");
		list1.add("iceman");
		
		// ? : unbounded wildcard
		ArrayList<?> list2 = list1; // ok
//		list2.add(""); // x // 뭐든지 넣을 수 있기 때문에 string도 integer도 못넣는 것
//		list2.add(200); // x
		
		ArrayList<Integer> list3 = new ArrayList<>();
		list3.add(100);
		list3.add(200);
		
		ArrayList<?> list4 = list3; // ok
//		list4.add(300); // x
//		list4.add(""); // x
//		list4.add(new Object()); // x
		
		// list4.get(0);
		Object o1 = list4.get(0); // 오브젝트에 꺼내 쓰는건 가능함 Object는 뭐든 가능하니까
		
	}
}

package ch15.lecture.p01list;

import java.util.List;
import java.util.Vector;

public class C05Vector {
	public static void main(String[] args) {	// Vector가 ArrayList보다 먼저나옴 둘이 비슷함 // thread-safe implementation(변경은 위험하니까)이 필요한게 아니면 ArrayList 쓰라.
		List<String> list = new Vector<>();
		list.add("java");
		list.add("css");
		
		System.out.println(list);
		list.remove(0);
		
		System.out.println(list);
		
		list.add(0, "spring");
		System.out.println(list);
		
		for (String item : list) {
			System.out.println(item);
		}
	}
}

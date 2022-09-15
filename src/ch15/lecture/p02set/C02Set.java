package ch15.lecture.p02set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C02Set {
	public static void main(String[] args) {
		// 전체 탐색 방법
		Set<String> set = new HashSet<>();
		set.add("Java");
		set.add("spring");
		set.add("jsp");
		set.add("css");
		set.add("html");
		set.add("java");
		
		System.out.println("향상된 for문"); // set은 그냥 for문이라 향상된 for문 불가능 // 아래서 만들어줘야함
		for (String element : set) {
			System.out.println(element);
		}
		
		System.out.println("Iterator 사용");
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) { // 이터레이터는 while문과 궁합이 잘 맞음
			System.out.println(iterator.next());
		}
		
		System.out.println("forEach 메소드 사용"); // while / forEach문도 가능
		set.forEach((e) -> System.out.println(e));
	}
}

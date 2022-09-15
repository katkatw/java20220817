package ch15.lecture.p02set;

import java.util.HashSet;
import java.util.Set;

public class C04Set {
	public static void main(String[] args) {
		// element가 같은지 판단
		// equals 메소드로 한다
		
		Set<String> set = new HashSet<>();
		System.out.println(set.add("java"));
		set.add("css");
		set.add("java");
		System.out.println(set.add(new String("java"))); 
		// 새로운 인스턴스?를 만들어도 equals메소드를 썼기때문에 java두개가 다 들어가진 않음
		
		System.out.println(set);
	}
}

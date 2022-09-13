package ch13.lecture.p05wildcard;

import java.util.ArrayList;

public class C02Polymorphism {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("java");
		list1.add("css");
		
//		ArrayList<Object> list2 = list1; 	// x
//		list2.add(new Object());		 // x -> "오브젝트는 스트링이다"도 안됨
		
		// 스트링은 오브젝트다 
		// BUT!!! 어레이리스트 스트링은 어레이리스트 오브젝트로 형변환 불가능
	}
}

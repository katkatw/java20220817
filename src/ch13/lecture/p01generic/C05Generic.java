package ch13.lecture.p01generic;

import java.util.ArrayList;

public class C05Generic {
	public static void main(String[] args) {
//		ArrayList<String> // type parameter에 string을 받는다
		ArrayList<String> list = new ArrayList<String>();
		list.add("3");
//		list.add(6); // add(E e) e는 String만 가능. Integer 불가능
		list.add("6");
		
//		list.get(0); // 마우스 호버하면 String 뜸		
		String v1 = list.get(0); // 형변환 없이 사용 가능
		String v2 = list.get(1);
		
		System.out.println(v1);
		System.out.println(v2);
	}
}

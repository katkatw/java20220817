package ch13.lecture.p01generic;

import java.util.ArrayList;

public class C06Generic {
	public static void main(String[] args) {
		// type parameter에 기본타입은 넣을 수 없음
//		ArrayList<int> list = new ArrayList<int>();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
//		list.add("3");
		list.add(3);
		list.add(6);
		
//		list.get(0); // 타입파라미터에 인티저 넣었으므로 호버하면 int뜸
		int v1 = list.get(0);
		Integer v2 = list.get(1);
		
		System.out.println(v1);
		System.out.println(v2);
	}
}

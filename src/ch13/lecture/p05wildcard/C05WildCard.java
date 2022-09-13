package ch13.lecture.p05wildcard; // 상위타입을 결정하는 와일드 카드가 필요할 때가 있다

import java.util.ArrayList;

public class C05WildCard {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Number> list2 = new ArrayList<>();
		ArrayList<Object> list3 = new ArrayList<>();
		
		setItems(list1);
		setItems(list2);
		setItems(list3);
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
	}
	
	public static void setItems(ArrayList<? super Integer> list) {
		list.add(100);
		list.add(200);
		list.add(300);
//		list.add(3.14); // x
	}
	
	/*
	public static void setItems(ArrayList<Integer> list) {
		list.add(100);
		list.add(200);
		list.add(300);
	}
	
	public static void setItems(ArrayList<Number> list) {
		list.add(100);
		list.add(200);
		list.add(300);
	}
	
	public static void setItems(ArrayList<Object> list) {
		list.add(100);
		list.add(200);
		list.add(300);
	}
	*/
}

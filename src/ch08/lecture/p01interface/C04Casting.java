package ch08.lecture.p01interface;

import java.io.Serializable;

public class C04Casting {
	public static void main(String[] args) {
		CharSequence o1 = "topgun"; // String에는 get인스턴스 메소드가 있다
		int len = o1.length();
		char c = o1.charAt(3);
		
		String o2 = (String) o1; // 강제형변환 해서 사용
//		byte[] bytes = o1.getBytes(); // 안되는 이유 CharSequence에 있는 것만 되므로
		
		Object o3 = (Object) o1;
		Serializable o4 = (Serializable) o1;
		Comparable<String> o5 = (Comparable<String>) o1;
		
//		StringBuilder o6 = (StringBuilder) o1;
		
		
//		boolean b = o1.isEmpty(); // 15버전부터 사용가능
	}
}

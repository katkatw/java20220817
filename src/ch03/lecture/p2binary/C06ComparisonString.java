package ch03.lecture.p2binary;

public class C06ComparisonString {
	public static void main(String[] args) {
		//듣고넘기라
		// String 끼리 비교 크기연산(<, <=, >, >=) 안됨
		String a = "hello";
		String b = "hi";
		
//		System.out.println(a < b); // X안됨
		
		// String 끼리 같은지 비교 연산 (==, !=)
		// 쓸 수는 있지만 절대 쓰지 말자 bug버그 나기 좋음
		String c = "java";
		String d = "java";
		String e = "ja";
		String f = "va";
		String g = e + f; // "java"
		
		System.out.println(c == d); // true
		System.out.println(c == g); // false //자주 false
		
		// 대신에!!!
		// equals 메소드 쓰기!!!
		System.out.println(c.equals(d)); // true
		System.out.println(c.equals(g)); // true // 항상 true
	}
}

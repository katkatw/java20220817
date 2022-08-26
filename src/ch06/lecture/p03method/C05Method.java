package ch06.lecture.p03method;

public class C05Method {
	public static void main(String[] args) {
		String s1 = new String("java");
		String s2 = "spring";
		
		char a = s1.charAt(0); 
		int b = s1.charAt(0);
		
		System.out.println(a); // j
		System.out.println(b); // 106 // j이지만 int로 출력하기 때문
		
		System.out.println(s1.length());
		System.out.println(s2.length());
	}
}

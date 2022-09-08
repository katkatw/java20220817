package ch07.lecture.p05class;

public class C01Class {
	public static void main(String[] args) throws ClassNotFoundException {
		Class c;
		
		String s1 = "java";
		
//		Class<String> // 2권 내용
		
		// instance의 getClass 메소드
		Class c1 = s1.getClass(); // c1은 s1의 생성설계도?를 가지고 있다
		System.out.println(c1.getName());
		
		// Class forName 메소드
		Class c2 = Class.forName("java.lang.String");
		System.out.println(c2.getName());
		
		// class 키워드 사용
		Class c3 = String.class;
		System.out.println(c3.getName());
		
		System.out.println(c1 == c2);
		System.out.println(c2 == c3);
	}
}

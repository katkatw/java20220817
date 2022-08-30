package ch07.lecture.p01inheritance;

public class C01Extends { // Extends 상속을 나타내는 키워드
	public static void main(String[] args) { // 필드와 메소드만 상속된다!
		SuperClass1 o1 = new SuperClass1(); // 인스턴스
		SubClass1 o2 = new SubClass1();		// 인스턴스
		
		o1.age = 33;
		o1.method1();
		System.out.println(o1.age);
		
		o2.age = 44;
		o2.name = "coyote";
		o2.method1();
		o2.method2();
		System.out.println(o2.age);
		System.out.println(o2.name);
		System.out.println(o2.name.getClass());
	}
}

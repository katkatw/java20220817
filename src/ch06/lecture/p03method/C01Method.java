package ch06.lecture.p03method;

public class C01Method {
	public static void main(String[] args) {
		MyClass1 o1 = new MyClass1();
		
		o1.name = "maverick";
		o1.age = 99; // (인스턴스) 필드
		
		o1.method(); // (인스턴스) 메소드 호출
		// 인스턴스가 존재해야 실행할  수 있다
		
		System.out.println("메인 메소드 코드1");
	}
}

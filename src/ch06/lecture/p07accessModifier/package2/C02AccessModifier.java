package ch06.lecture.p07accessModifier.package2;

import ch06.lecture.p07accessModifier.package1.MyClass1;

public class C02AccessModifier {
	public static void main(String[] args) {
		MyClass1 o1 = new MyClass1();
//		o1.name = "coyote";
//		o1.name = "iceman"; // 접근지정자 생략해서 다른 패키지에선 사용 불가
//		o1.printName(); // 접근지정자 없어서 다른 패키지에서 사용 불가
		
		o1.age = 9999;	// public 멤버는 다른 패키지에서 사용 가능 // (멤버 : 필드와 메소드)
		o1.printAge();  // public 멤버는 다른 패키지에서 사용 가능
		
		// private 멤버는 같은 패키지여도 사용 불가능 (즉 클래스 내에서만 사용가능)
//		o1.secret = "my secret"; 
//		o1.secret("my secret"); 
		
	}
}

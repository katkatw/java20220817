package ch06.book.s061302.package2;  // <------- 패키지가 다름

import ch06.book.s061302.package1.A;

public class C {
	// 필드
	A a1 = new A(true);			// (o)
//	A a2 = new A(1);			// (x) <------- default 생성자 접근 불가 (컴파일 에러)
//	A a3 = new A("문자열");		// (x) <------- private 생성자 접근 불가 (컴파일 에러)
		
	
	// 맨위에 a1만 A.java에서 public이라서 실행되고 
	// 나머지는 안되는듯하다.
}

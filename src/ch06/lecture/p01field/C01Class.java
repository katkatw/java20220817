package ch06.lecture.p01field;

public class C01Class {
	public static void main(String[] args) {
		String a = new String("java");
		
		MyObject o1 = new MyObject(); //
		MyObject o2 = new MyObject(); // 두 인스턴스는 서로 다른 인스턴스
	}
}

// class : 객체 설계도(청사진)
// class 클래스명 {
// 	  클래스body
// }

// 클래스명 작성 가능 문자 : 영문대소문자, _, $, 숫자

// 클래스명 작성 관습 : UpperCamelCase 

// 해도 되긴 하지만 관습에 어긋나는 두 방식
// upperCamelCase (lower)
// Upper_Camel_Case (snake)
class MyObject {
	
}


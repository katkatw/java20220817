package ch07.book.s070706;

public class InstanceExample {
	public static void method1(Parent parent) {
		if (parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
		// 얘네 다 실행되면 main안에 method2(parentA)로 가는 것
	}
	
	public static void method2(Parent parent) {		
		Child child = (Child) parent;
		System.out.println("method2 - Child로 변환 성공");
		// 
	}
	
	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA);	// (method1에서)
		method2(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);					// (method1에서) false여서 else로 간다.
		method2(parentB);	// *예외발생* 	// (method2에서) Parent는 Child일 수 없으므로 ClassCastException이 나옴
	}
	
}

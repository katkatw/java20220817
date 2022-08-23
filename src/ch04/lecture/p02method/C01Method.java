package ch04.lecture.p02method;

public class C01Method { //얘도 메소드
	public static void main(String[] args) { // 얘도 메소드 = 함수다
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		
		// call method (invoke method)
		method1(); //메소드 호출
		method1();
		
		System.out.println(4);
		
		method1();
		method2();
		System.out.println(5);
		System.out.println(6);
		method2();
	}
	
	// 메소드(method)
	public static void method1() { // 보라색 안에 있는건 꼭 써야하는건아님
		System.out.println("a");   // method1은 다른 메소드 뒤에 오기때문에 
		System.out.println("b");   // 호출해야만 출력된다
		System.out.println("c");
	}
	
	// method2 메소드 작성하고 main에서 method2를 호출하는 코드 작성
	public static void method2() {
		System.out.println("hello");
	}
}

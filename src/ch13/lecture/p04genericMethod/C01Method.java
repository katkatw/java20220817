package ch13.lecture.p04genericMethod;

public class C01Method {
	public static void main(String[] args) {
		C01Method.<String>method1("str");
		C01Method.<Integer>method1(33);
		C01Method.<Double>method1(3.14);
		
		// 메소드 타입 파라미터 생략 가능 
		// 파라미터 타입을 보고 T가 결정이 되므로 바로 넣어서 씀
		method1("str"); 
		method1(99);
		method1(3.14);
	}
	public static <T> void method1(T p) {
		
	}
	public static void method(Object o) {
		
	}
	public static void method(String o) {
		
	}
	public static void method(Integer i) {
	
	}
}

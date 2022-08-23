package ch04.lecture.p02method;

public class C05Parameter {
	public static void main(String[] args) {
		method1(3);
		method2(3.14);
		method2(5); //정수타입은 실수타입에 들어갈 수 있기 때문에 변경에 문제가 없다.
//		method1(3.14);// 이건안댐
//		method2("3.14"); //String도 안됨
		
		int a = 3;
		method1(a);
		
		double b = 3.14;
		method2(b); // 변수도 넣을 수 있다
		
//		method3(1); //x
//		method3(2, 1); //x
		method3(3, 4, 5); // 3개 넣는다고 했을땐 무조건 3개 다 호출해야 한다.
		
//		method4(3.14, 3); //x		
		method4(3, 3.14); // 타입도 순서대로 넣어야 한다(?)
		method4(3, 5); // ok
	}
	
	public static void method4(int p1, double p2) {
		
	}
	
	public static void method3(int p1, int p2, int p3) {
		
	}
	
	public static void method1(int param) {
		
	}
	
	public static void method2(double param) {
		
	}
	
}

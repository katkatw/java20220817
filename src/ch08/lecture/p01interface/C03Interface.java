package ch08.lecture.p01interface;

public class C03Interface {
	public static void main(String[] args) {
		MyInterface3 o1 = new MyClass3();
		MyInterface3 o2 = new MyClass4();
		
		o1.method1();
		o1.method2(); // MyClass4에 재정의된 메소드가 실행된다.
		o1.method3();
		o1.method4();
		
		o2.method1();
		o2.method2();
		o2.method3();
		o2.method4();
		System.out.println("==========메소드 호출");
		method1(o1); // MyClass3의 메소드가 아래서 실행된다.
		method1(o2); // MyClass4의 메소드 실행. 위에 MyInterface3 o2 = new MyClass4();
		
	}
	
	public static void method1(MyInterface3 o) {
		o.method1(); // 명시한 추상메소드를 실행할수 있다. // 어떤메소드가 들어오든 실행된다
		o.method2();
		o.method3();
		o.method4();
	}
}

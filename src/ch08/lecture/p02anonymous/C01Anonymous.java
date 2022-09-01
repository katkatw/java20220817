package ch08.lecture.p02anonymous;

public class C01Anonymous {
	public static void main(String[] args) {
//		MyInterface1 o1 = new MyInterface1(); 인터페이스로는 인스턴스를 만들수 없으니 클래스를 만들어야함
//		MyInterface1 o2 = new MyClass1(); 	// 2번
		
		// 인터페이스 구현과 객체 생성을 한 번에
		MyInterface1 o3 = new MyInterface1() {
			@Override
			public void method() {
				System.out.println("재정의한 메소드");		
			}		
		};
		
		o3.method();
	}
}

//class MyClass1 implements MyInterface1 { //2번 내용
//	@Override
//	public void method() {	
//	}				
//}

interface MyInterface1 {
	void method(); // public abstract method();
}
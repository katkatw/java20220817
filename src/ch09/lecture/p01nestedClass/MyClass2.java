package ch09.lecture.p01nestedClass;

public class MyClass2 {
	public static void main(String[] args) {
		class LocalClass implements MyInterface2 {

			@Override
			public void method() {
				System.out.println("재정의한 메소드");
			}
		}
		
		MyInterface2 l = new LocalClass(); // 인스턴스는 로컬클래스 타입이기도 하지만 마이인터페이스 타입이기도 하다.
		l.method(); // 이 코드를 줄인게 익명클래스 객체였다...
	}
}

interface MyInterface2 {
	void method();
}
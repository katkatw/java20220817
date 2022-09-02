package ch09.lecture.p01nestedClass;

public class MyClass3 {
	public static void main(String[] args) {
		MyInterface3 l = new MyInterface3() {

			@Override
			public void method() {
				System.out.println("재정의한 메소드!!!");
			}		
		};
		
		l.method();
	}
}

interface MyInterface3 {
	void method();  // 클래스 만들고 재정의 하고 인스턴스 만드는걸 한번에 하는 법
}

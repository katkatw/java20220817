package ch09.lecture.p02lambda;

public class MyClass1 {
	public static void main(String[] args) {
		MyInterface1 o1 = () -> {	// 파라미터 -> 메소드 () -> {};
			System.out.println("코드 작성");
		}; 
	}
}

// 재정의해야하는 메소드 한 개 (추상메소드1개)
interface MyInterface1 {	// 디폴트 스태틱 몇개든 상관없음
	void method1();
	
}
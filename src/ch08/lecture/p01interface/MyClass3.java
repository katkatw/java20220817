package ch08.lecture.p01interface;

public class MyClass3 implements MyInterface3 {	// 보이지 않지만 추상메소드 4개가 있다
	// abstract class 로 하거나
	// 적고싶지 않으면 4개의 추상메소드를 재정의해야한다.
	
	@Override
	public void method1() {
		System.out.println("myclass3 method1");
		
	}

	@Override
	public void method2() {
		System.out.println("myclass3 method2");
		
	}

	@Override
	public void method3() {
		System.out.println("myclass3 method3");
		
	}

	@Override
	public void method4() {
		System.out.println("myclass3 method4");
		
	} 

}

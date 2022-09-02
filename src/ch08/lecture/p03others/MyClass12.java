package ch08.lecture.p03others;

public class MyClass12 implements MyInterface1 {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}
	
	// default메소드 override 가능
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		MyInterface1.super.method2();
		// 그냥 메소드 super();면 오브젝트를 상속하게 되므로??
	}

}

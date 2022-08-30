package ch07.lecture.p01inheritance;

public class SubClass5 extends SuperClass5 { // super키워드로 필드나 메소드에 접근할 수 있음 
	
	@Override
	public void method1() {
//		System.out.println("아주 중요하거나 너무 긴 코드");
		super.method1();
		System.out.println("추가한 코드들....");
	}
	
	
}

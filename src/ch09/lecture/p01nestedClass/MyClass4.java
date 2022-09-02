package ch09.lecture.p01nestedClass;
//		설명문
//		MyInterface4 l = // MyInterface를 구현한 클래스의 인스턴스
// 		추상메소드가 하나밖에 없으면, 재정의할 메소드가 하나라면
//		디폴트 메소드가 몇개든지 아래로 할 수 있음 (14장 lambda 표현식)
//		람다는 결국 로컬 메소드다



public class MyClass4 {
	public static void main(String[] args) {

		// lambda expression (14장)
		// 클래스 구현, 메소드 시그니처 생략 가능
		// 추상메소드가 하나인 경우만 사용 가능
		MyInterface4 l = () -> {
			System.out.println("재정의한 메소드");
		};
	}
}




interface MyInterface4 {
	void method();
}
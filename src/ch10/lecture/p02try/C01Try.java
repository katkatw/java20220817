package ch10.lecture.p02try;

public class C01Try {
	public static void main(String[] args) {
		int a = 3;
		int b = 0;
		
		try { 
			// try : Exception이 발생할 수 있는 코드 블럭
			int c = a / b;
		
			System.out.println(c);
			
		} catch (ArithmeticException e) { // 인스턴스 참조값을 잡는 문법
			// 발생한 exception 객체 잡고 실행하는 코드 블럭
			System.out.println("EXCEPTION발생하면 실행하는 코드 블럭");
		} // catch블럭은 exception 발생 가능 유무에 따라 실행됨
		
		System.out.println("프로그램 실행 이어가기~");
	}
}

package ch10.lecture.p01exception;

public class C02NullPointerException {
	public static void main(String[] args) {
		String a = "topgun"; // a 참조값은 topgun인스턴스를 가리키고 있다
		String b = null; 	// 참조하는 인스턴스(객체) 없음
		System.out.println(a.length());
		System.out.println(b.length()); // NullPinterException 
												// 가리키고 있는게 Null이다
		
		System.out.println("프로그램 종료");
	}
}

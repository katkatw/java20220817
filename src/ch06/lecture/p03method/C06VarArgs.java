package ch06.lecture.p03method;

public class C06VarArgs {
	public static void main(String[] args) {
		method1(); // 스태틱에서는 메소드 접근 불가
		method1(3);
		method1(3, 4);
		method1(5, 7, 9);
	} 
	
	static void method1() {
		System.out.println("파라미터 없는 메소드");
	}
	
	static void method1(int a) { // 같은 스태틱 메소드도
		// 파라미터 타입 순서 갯수만 다르면 됨
		System.out.println("인트 파라미터 하나인 메소드");
	}
	
	// 가변인자 (varargs) 다양한 아규먼트
	// 같은 타입을 여러개(몇개인지 모름) 받을 경우 사용가능
	// 메소드 내에서 배열로 사용
	static void method1(int... i) { 
		System.out.println("파라미터 여러개 받는 메소드");
		System.out.println(i.length);
		System.out.println(i[1]);
	}
	
	// 가변인자는 파라미터 목록 끝에만 작성 가능
	static void method1(String s, int... i) { 
		
	}
//	static void method1(int... i, String s) { 
		
//	}
}

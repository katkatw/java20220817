package ch06.lecture.p03method;

public class MyClass4 {
	
	// 메소드리턴 타입 : 메소드 내에서 반환하는 값의 타입
	// 단, void는 리턴값이 없음
	void method1() {
		
		// return 0; 처럼 할 수 없음 void는 이미 0을 뜻하고
		// 여기서의 return은 종료의 뜻으로 쓰는 것이기 때문
		// return : 메소드 종료, 값 반환
	}
	
	int method2() {
		
		return 3;
	}
	
	int method3() {
		
		return 5;
	}
	
	int method4() {
		
		int a = 3;
		if (a == 3) {
			return 10;
		}
		
		return 9; 
	}
}

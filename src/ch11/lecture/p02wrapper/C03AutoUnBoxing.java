package ch11.lecture.p02wrapper;

public class C03AutoUnBoxing { // 기본 참조 섞어서 쓰는 방법
	public static void main(String[] args) {
		Integer a = 99;
		// 참조타입을 기본타입으로 변경(unboxing)
		int b = a.intValue(); // 인트밸류로 안에 있는 밸류를 꺼내서 언박싱
		
		// 참조타입을 기본타입으로 자동변경(auto unboxing)
		int c = a; // ok
		
		Object d = 99; 
//		Integer e = d; // xx 상위타입을 하위타입에 넣을 수 없다
//		int f = d; // xx
		
		int g = (Integer) d; // 강제형변환도 되지만 위험한 코드
		
		Object[] arr = {"java", 3, 3.14};
		String h = (String) arr[0];
		Integer i = (Integer) arr[1];
		double j = (Double) arr[2];	// ok
		
		double k = (double) arr[2];	// ok
		
		System.out.println("프로그램 실행 이어감.");
	}
}

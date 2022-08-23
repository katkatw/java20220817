package ch04.lecture.p01control;

public class C07For { // 무한루프 관련한 설명
	public static void main(String[] args) {
//		for(int i =1; i >0; i++) {
//			System.out.println("hello");
//		}
//	}
		System.out.println("1~5");
		for(int i =1; i <= 5; i++) {
			System.out.println(i);
		}
		
		System.out.println("5~10");
		for (int i = 1; i <= 6; i++) {
			System.out.println(i + 4);
		}
			
		System.out.println("5~1");
		for(int i =5; i >= 1; i--) {
			System.out.println(i);
		}
		
		System.out.println("10~5");
		for(int i =10; i >= 5; i--) {
			System.out.println(i);
		}
	}
}

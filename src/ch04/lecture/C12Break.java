package ch04.lecture;

public class C12Break {
	public static void main(String[] args) {
		System.out.println(1);
		
		while (true) {
			System.out.println(2);
			//break; //브레이크 들어가면 3이 실행되지 않는다
			if (true) {
				break;
			}
			System.out.println(3);
		}
		
		
		System.out.println(4);
	}
}

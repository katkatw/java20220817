package ch04.lecture.p01control;

public class C09연습 {
	public static void main(String[] args) {
		// 01234
		System.out.println("===============================");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		//12345
		System.out.println("===============================");
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		//54321
		System.out.println("===============================");
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > 0; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		//43210
		System.out.println("===============================");
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >= 0; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("===============================");
	}
}

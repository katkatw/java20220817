package ch16.book.s140601;

public class Calculator {
	public static int staticMethod(int x, int y) {
		return x + y;
	}
	
	public int instanceMethod(int x, int y) { // static이 없어서 인스턴스가 생겨야만 쓸 수 있는 메소드
		return x + y;
	}
}

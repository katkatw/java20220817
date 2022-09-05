package ch10.lecture.p04throws;

public class C03Throws {
	public static void main(String[] args) {
		int a = Integer.parseInt("3"); // parseInt는 NumberFormatException이 발생할 수 있는 메소드
		// NumberFormat은 RuntimeException을 상속한다
	}
}

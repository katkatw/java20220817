package ch03.book;

public class OverflowExample1 {
	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		System.out.println(z);
	}
}

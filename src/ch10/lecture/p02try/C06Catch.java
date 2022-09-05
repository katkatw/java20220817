package ch10.lecture.p02try;

public class C06Catch {
	public static void main(String[] args) {
		try {
			int a = 3 / 0;
		} catch (Exception e) { // catch블록에서는 throwable까지만 가능
			System.out.println("영으로 나누려고???");
		}
	}
}

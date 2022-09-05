package ch10.lecture.p02try;

public class C03Finally {
	public static void main(String[] args) {
		try {
			int a = 3 / 0;
			
			if (a == 1) {
				return;	// 리턴키워드는 메소드를 종료시키지만 try블럭안의 리턴은 finally가 무조건 실행됨. try문 밖의 것은 안되지만?
			}
		} catch (ArithmeticException e) {
			System.out.println("exception!!!!!!");
		} finally {
			System.out.println("@@@@finally");
		}
		
		System.out.println("continues...........");
	}
}

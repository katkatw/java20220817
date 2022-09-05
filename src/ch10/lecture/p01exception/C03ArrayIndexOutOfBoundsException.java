package ch10.lecture.p01exception;

public class C03ArrayIndexOutOfBoundsException {
	public static void main(String[] args) {
	//어디선가 접근 가능 // 스태틱 // 리턴타입 없고 // 파라미터는 스트링배열을 받는다
		
		if (args.length > 3) {
			System.out.println(args.length);
			System.out.println(args[0]);
			System.out.println(args[1]);
			System.out.println(args[2]);
			System.out.println(args[3]);
		}
		
	}
}

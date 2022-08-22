package ch04.book;

public class SwitchExample {
	public static void main(String[] args) {
		int num = (int)(Math.random()*6) + 1;
		// 1,2,3,4,5,6 중에 하나의 값이 num 에 들어간다
				
		switch(num) {
			case 1:
				System.out.println("1번이 나왔습니다.");
				break;
			case 2:
				System.out.println("2번이 나왔습니다.");
				break;
			case 3:
				System.out.println("3번이 나왔습니다.");
				break;
			case 4:
				System.out.println("4번이 나왔습니다.");
				break;
			case 5:
				System.out.println("5번이 나왔습니다.");
				break;
			default:
				System.out.println("6번이 나왔습니다.");
				break;
		}
	
	}
}

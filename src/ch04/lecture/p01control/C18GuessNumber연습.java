package ch04.lecture.p01control;

import java.util.Scanner;

public class C18GuessNumber연습 {
	public static void main(String[] args) {
		// 컴퓨터 1~100 random
		// 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("(컴퓨터 1~100 random)");
		while (true) {System.out.println("번호를 입력하세요(1~100):");
		
			int user = scanner.nextInt(); // 입력값을 기다리는 코드
			
			int d = (int) (Math.random() * 100) + 1;
			
			System.out.println("컴퓨터 결과 : " + d);
			
			
			if (user == d) {
				System.out.println("맞췄습니다.");
				break;
				
			} else {
				System.out.println("틀렸습니다.");
				
			}
		}
	}
}

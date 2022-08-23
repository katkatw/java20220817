package ch04.book.exercise;

import java.util.Scanner;

public class Exercise04연습 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("(주사위 던지기)");
		while (true) {System.out.println("번호를 두개 입력하세요(1~6):");
			
			int user = scanner.nextInt();
			
			int d1 = (int) (Math.random() * 6) + 1;
			int d2 = (int) (Math.random() * 6) + 1;
			
			System.out.println("(" + d1 + "," + d2 + ")");
			
			if ((d1 + d2) == 5) {
				break;
			} else {
				continue;
			}
		}
	}
}

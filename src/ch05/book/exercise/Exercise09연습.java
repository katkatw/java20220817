package ch05.book.exercise;

import java.util.Scanner;

public class Exercise09연습 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while (run) {
			System.out.println("--------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if (selectNo == 1) {
				System.out.println("학생수> ");
				int students = scanner.nextInt();
				
				studentNum = students;
				
				break;
				
			} else if(selectNo == 2) {
				System.out.println("scores[i]> ");
				int scoreUpdate = scanner.nextInt();
			
				
				break;
				
			} else if(selectNo == 3) {
				System.out.println("scores[i]> ");
				int scoreList = scanner.nextInt();
				
				break;
								
			} else if(selectNo == 4) {
				System.out.println("최고 점수> " + scores);
				System.out.println("평균 점수> " + scores);
				
				break;
				
			} else if(selectNo == 5) {
				run = false;
				
				break;
			} 
		}
		
		System.out.println("프로그램 종료");
	}
}

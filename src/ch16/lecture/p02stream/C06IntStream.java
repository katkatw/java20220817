package ch16.lecture.p02stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C06IntStream {
	public static void main(String[] args) { // int double long 등 사용 가능함
		
		// 1~10까지 출력
		System.out.println("1~10까지 출력");
		IntStream.rangeClosed(1, 10)
			.forEach((e) -> System.out.println(e));
		System.out.println();

		
		
		// 1~100까지의 합 출력
		System.out.println("1~100까지의 합 출력");
		int r1 = IntStream.rangeClosed(1, 100)
			.sum();
		System.out.println(r1);
		System.out.println();
		System.out.println();
		
		
		
		// 1~100까지의 수 중 홀수의 합 출력
		System.out.println("1~100까지의 수 중 홀수의 합 출력");
		Integer r2 = IntStream.rangeClosed(1, 100)
			.filter((e) -> e % 2 == 1) // 홀수만
			.sum();
		System.out.println(r2);
		System.out.println();
		System.out.println();
		
		
		
		// [5, 10, 20, 1, 6]의 평균 구하기 // avg메소드 쓰고 api서 리턴타입 보고하기
		System.out.println("[5, 10, 20, 1, 6]의 평균 구하기");
		Double r3 = IntStream.of(5, 10, 20, 1, 6)  									// Double인 이유
			.average()
			.getAsDouble();
		System.out.println(r3);
		System.out.println();
		System.out.println();
		
		
		
		// 주사위(1~6) 5번 던진 결과 출력
		System.out.println("주사위(1~6) 5번 던진 결과 출력");
		IntStream.generate(() ->(int) (Math.random() * 6) + 1)			
			.limit(5)
			.forEach( e -> System.out.println(e));
		System.out.println();
		
		
		
		// 로또번호(1~45) 6개 작은 수 부터 출력 (중복없이)
		System.out.println("로또번호(1~45) 6개 작은 수 부터 출력 (중복없이)");
		IntStream.generate(() ->(int) (Math.random() * 45) + 1)
			.distinct() // 중복 없이
			.limit(6)
			.sorted()	// 작은 수부터
			.forEach( e -> System.out.println(e));
	}
}	

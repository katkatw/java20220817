package ch16.lecture.p02stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class C05IntStream {
	public static void main(String[] args) {
		
		// IntStream : 기본타입 int가 요소인 Stream
		
		// 생성방법1 : of static 메소드
		int r1 = IntStream.of(10, 9, 20, 2, 3, -1) // 최댓값 최솟값 썸 등등 // int타입 리턴
			.sum();
			
		System.out.println(r1);

		// 생성방법2 : Arrays.stream static 메소드
		int r2 = Arrays.stream(new int[] {10, 9, 20, 2, 3, -1})
				.sum();
		System.out.println(r2);
		
		// 생성방법3 : IntStream.range static 메소드
		//           : IntStream.rangeClosed  메소드
		int r3 = IntStream.range(1, 11) // 1부터 11전까지의 합
			.sum();
		System.out.println(r3);
		
		int r4 = IntStream.rangeClosed(1, 10) // 1부터 10까지
				.sum();
		System.out.println(r4);
		
		// 생성방법4 : IntStream.generate static 메소드
		IntStream.generate(() -> 1)// 여기들어간 1
			.limit(5)
			.forEach( e -> System.out.println(e));	// element e가 됨
		
		IntStream.generate(() ->(int) (Math.random() * 45) + 1)
			.distinct()
			.limit(6)
			.forEach( e -> System.out.println(e));
		
	}
}

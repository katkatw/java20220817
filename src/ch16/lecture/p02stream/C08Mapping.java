package ch16.lecture.p02stream;

import java.util.stream.Collectors;
import java.util.stream.IntStream;						//Interface IntStream 메소드를 보면 sorted() 거꾸로 출력하고 싶으면
														// IntStream에는 없고 Stream에는 있는 mapToObj랑 boxed()가 있음
																
public class C08Mapping {
	public static void main(String[] args) {
		// IntStream (primitive type stream) -> Stream<Integer>
		// 프리미티브 타입을 참조타입으로 바꾸는 boxed() 메소드
		
		IntStream.of(3, 5, 9, 1, 0)
			.boxed()		// Stream<Integer>를 리턴하는 메소드
			.sorted((a, b) -> b - a)
			.forEach((e) -> System.out.println(e));
		

		String res = IntStream.of(3, 5, 9, 1, 0)	// "9, 5, 3, 1, 0"
				.boxed()				 			// boxed 시키고
				.sorted((a, b) -> b - a)	 		// 거꾸로 정렬
				.map((e) -> e + "")					// 변경
				.reduce((s1,  s2) -> s1 + "," + s2)
				.get();			// Optional이기때문에 .get()메소드 필수!
		System.out.println(res);
				
		
		
		String res1 = IntStream.of(3, 5, 9, 1, 0)	//reduce와 비슷하게 다른 타입으로 변경할 수 있는 collect 메소드
				.boxed()				 			
				.sorted((a, b) -> b - a)	 		
				.map((s) ->String.valueOf(s))					
				.collect(Collectors.joining(","));
		System.out.println(res1); 
	}
}

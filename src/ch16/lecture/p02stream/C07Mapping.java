package ch16.lecture.p02stream;

import java.util.stream.Stream;

public class C07Mapping {
	public static void main(String[] args) {
		// map 메소드 : 원본 원소의 타입을 다른 타입으로 변경한 스트림을 리턴 ~~~~~~~
		int r1 = Stream.of("3", "6", "9", "1") // 원본데이터는 이건데 인티저처럼 쓰고 싶을때
			.map((s) -> Integer.valueOf(s)) 				  // 중간연산으로 // 맵을 거치면서 String이 Integer로 바뀜
			.reduce((a, b) -> a + b)
			.get();
		
		System.out.println(r1);
		
		int r2 = Stream.of("3house", "2water", "1cup", "7pc", "9cpu") // 뭐라는 거징	
			.map((s) -> s.substring(0, 1))
			.map((s) -> Integer.valueOf(s))
			.reduce((a, b) -> a + b)
			.get();		
		
		System.out.println(r2);
		
		int r3 = Stream.of("3house", "2water", "1cup", "7pc", "9cpu") 
				.mapToInt((s) -> Integer.parseInt(s.substring(0, 1))) 				 
				.sum();
		
			System.out.println(r3);
	}
}

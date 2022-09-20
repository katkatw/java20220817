package ch16.lecture.p02stream;

import java.util.stream.Stream;

public class C17MethodReference {
	public static void main(String[] args) {
		Stream.of("spring", "java", "css")
			.forEach((e) -> System.out.println(e)); // e파라미터 받아서 실행한 메소드
		
		Stream.of("spring", "java", "css")	// 객체 :: 메소드명
		.forEach(System.out::println);		
		
		// 이렇게도 할 수 있다
	}
}

package ch16.lecture.p02stream;

import java.util.Optional;
import java.util.stream.Stream;

public class C03TerminalOperation {
	public static void main(String[] args) {
		Stream<String> stream1 = Stream.of("ironman", "panther", "widow", "spider", "captain");
		stream1.forEach((e) -> System.out.println(e)); // 종료연산 // 파라미터로 받은 컨슈머 인터페이스의 메소드를 사용해서 안에 있는 엘레멘트들 e를 하나씩 받아서 출력
	
		Stream<String> stream2 = Stream.of("ironman", "panther", "widow", "spider", "captain");
		
//		stream2.reduce((a, b) -> a + "," + b);
		Optional<String> o1 = stream2.reduce((a, b) -> a + "," + b);
		System.out.println(o1.getClass());
		
		Stream<String> stream3 = Stream.of("ironman", "panther", "widow", "spider", "captain");

		String o2 = stream3.reduce("heros", (a, b) -> a + "," + b); // 초기값이 있으니까 optional 안써도 받을 수 있다!!!
//		Optional<String>o2 어쩌구 다음 줄에 System.out.println(o1.getClass()); 안해도 됨
		System.out.println(o2);

	}
}

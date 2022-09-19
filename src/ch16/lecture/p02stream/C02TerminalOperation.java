package ch16.lecture.p02stream;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C02TerminalOperation { // 종료 연산들
	public static void main(String[] args) { 
		// stream 연산
		// 1. 중간 연산 ( 중간 처리 ) intermediate operation	// 예) Filter Doublestream Intstream
		// 2. 종료 연산 ( 최종 처리 ) terminal operation		// 예) forEach 
		
		// 구분법 : 중간 연산 (method)은 리턴 타입이 xxxStream	
		// 			최종 연산 (method)는 리턴 타입이 Stream이 아님 (주로)
		
//		List.of("java", "css", "spring", "html", "jsp");
		Stream<String> stream1 = List.of("java", "css", "spring", "html", "jsp").stream();
		
		// findAny : 아무거나 하나
		Optional<String> option1 = stream1.findAny();
		System.out.println(option1.orElse("없네요.")); // 랜덤은 아니다
		
		
		Stream<String> stream2 = List.of("java", "css", "spring", "html", "jsp").stream();
		
		// findFirst : 첫번째 element
		Optional<String> option2 = stream2.findFirst();
		
		System.out.println(option2.orElse("없네요.")); // Stream1이 흘러가고 있는데 findAny일때 종료되서 재사용 불가능 다시 steam1쓸 수 없음
		
		// max : 가장 큰 element
		Stream<String> stream3 = List.of("java", "css", "spring", "html", "jsp").stream();
		Optional<String> option3 = stream3.max((a, b) -> a.compareTo(b));
		System.out.println(option3.get());
		
		// min : 가장 작은 element
		Stream<String> stream4 = List.of("java", "css", "spring", "html", "jsp").stream();
		Optional<String> option4 = stream4.min((a, b) -> a.compareTo(b));
		System.out.println(option4.get());
		
		//  흘러가는 스트림에서 max min 메소드 쓰기
		IntStream stream5 = IntStream.of(100, 200, 50, -50, 7, 6, 9);
		OptionalInt max1 = stream5.max();
		System.out.println(max1.getAsInt());
		
		IntStream stream6 = IntStream.of(100, 200, 50, -50, 7, 6, 9);
		OptionalInt min1 = stream5.min();
		System.out.println(min1.getAsInt());
	}
}

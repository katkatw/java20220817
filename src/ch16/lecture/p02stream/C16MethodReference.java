package ch16.lecture.p02stream;

import java.util.stream.IntStream;

public class C16MethodReference {
	public static void main(String[] args) {
		int max = IntStream.of(3, 9, 1, 0, 10)
			.boxed()
//			.max((x, y) -> x.compareTo(y))
			.max(Integer::compareTo) // 인티저에 있는 컴페어 투 메소드 // 순서같을때 쓸 수 있다
			.get();
		
		System.out.println(max);
		
		int max2 = IntStream.of(3, 9, 1, 0, 10)
				.boxed()
//				.max((a, b) -> Integer.compare(a, b)) // parameter 순서대로 가니까
				.max(Integer::compare) // 또 쓸 수 있다
				.get();

		System.out.println(max2);
	}
}

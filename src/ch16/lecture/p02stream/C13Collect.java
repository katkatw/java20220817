package ch16.lecture.p02stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class C13Collect {
	public static void main(String[] args) {
		List<Integer> list1 = IntStream.range(1, 100)
			.filter((n) -> n % 2 == 0)
			.boxed()	// boxed를 해야 collect 하나짜리 쓸 수 있음
			.collect(Collectors.toList());
		
		System.out.println(list1);
	}
}

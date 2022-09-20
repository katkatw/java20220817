package ch16.lecture.p02stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class C21GroupingBy {
	public static void main(String[] args) {	// 스트림 안에 있는 걸 어떻게 그루핑할 건지 분류에 관한 메소드
		Map<String, List<Integer>> map = IntStream.of(3, 5, 2, 4, 9, 10)
		.boxed()
		.collect(Collectors.groupingBy((e) -> (e % 2 == 0) ? "짝수" : "홀수"));
		
		System.out.println(map);
	}
}

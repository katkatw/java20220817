package ch16.lecture.p02stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class C12Collect {
	public static void main(String[] args) {
		List<Integer> list1 = IntStream.range(1, 100) 			// 100포함 안됨
				.parallel()					// 병렬 !!!
				.filter(n -> n % 2 == 0) 	// 짝수만
				.collect(() -> new ArrayList<>(), 				// 새 컨테이너 생성
						(r, e) -> r.add(e), 					// 원소를 컨테이너에 넣음
						(r1, r2) -> r1.addAll(r2));	
		
		System.out.println(list1);
	}
}

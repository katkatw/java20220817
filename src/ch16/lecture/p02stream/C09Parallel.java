package ch16.lecture.p02stream;

import java.util.List;

public class C09Parallel {
	public static void main(String[] args) {
		List<String> list1 = List.of("java", "css", "spring", "js", "html");
		
		list1.parallelStream() // 종료중간연산 똑같이 함
			.forEach((e) -> System.out.println(e)); // 리스트를 스트링으로 만드면 순서대로 나오는데 병렬로 만들면 순서보장 안됨
		
		list1.parallelStream() // forEachOrdered 순서보장 병렬식
		.forEachOrdered((e) -> System.out.println(e)); 
	
	}
}

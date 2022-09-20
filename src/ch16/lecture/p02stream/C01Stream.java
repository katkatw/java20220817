package ch16.lecture.p02stream; // List.of Set.of Arrays.stream Stream.of

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class C01Stream { // 아이템이 흘러가면 중간에 연산을 넣을수도 끝에 넣을 수도 있다. 두가지 연산
	public static void main(String[] args) {
		List<String> list = List.of("java", "css", "spring", "js", "html"); // list set math??
		Stream<String> stream1 = list.stream();
		
		Set<String> set = Set.of("ironman", "hang", "bat", "superman", "iceman");
		Stream<String> stream2 = set.stream();
		
		String[] arr = {"rm", "jimin", "v", "jungkuk"};
		Stream<String> stream3 = Arrays.stream(arr);
		
		
		Stream<String> stream4 =  Stream.of("captain", "widow", "panther");
	}
}

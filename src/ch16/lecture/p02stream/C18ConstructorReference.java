package ch16.lecture.p02stream;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C18ConstructorReference {
	public static void main(String[] args) {
//		toCollection 는 Supplier<C> C는 콜렉션의 하위타입
		Set<String> set3 = Stream.of("java", "css", "spring", "html", "jsp", "java", "css") 
				.collect(Collectors.toCollection(() -> new TreeSet<>()));				
		
		System.out.println(set3);
		

		Set<String> set4 = Stream.of("java", "css", "spring", "html", "jsp", "java", "css") 
				.collect(Collectors.toCollection(TreeSet::new));	// 생성자 레퍼런스 // TreeSet을 만들기만 할때는 사용 가능 // 순서도 같을때			
		
		System.out.println(set4);
	}
}

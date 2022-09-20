package ch16.book.exercise.p7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
			new Member("홍길동", "개발자"),
			new Member("김나리", "디자이너"),
			new Member("신용권", "개발자")
		);
		
		List<Member> developers = list.stream()
				.filter((m) -> m.getJob().equals("개발자")) //m이라는 멤버 getJob으로 직업 찾기
				.collect(Collectors.toList()); 		// 뽑아내는 식
		
//		 import static java.util.stream.Collectors.*; 하면 
//		 .collect(toList()); 로 줄여 쓸 수 있다 ~~~~~~
				
				
		developers.stream()
				.forEach(m -> System.out.println(m.getName()));
	}

	
	static class Member {
		private String name;						  // field
		private String job;
	
		public Member(String name, String job) {      // 생성자
			this.name = name;
			this.job = job;
		}
	
		public String getName() { return name; }	 // 메소드 ???
		public String getJob() { return job; }
	}
}
package ch15.lecture.p02set;

import java.util.HashSet;
import java.util.Set;

public class C03Set {
	public static void main(String[] args) {
		// Set 만들기
		Set<String> set1 = new HashSet<>(); // 수정 가능한 Set
		set1.add("bob");
		set1.add("hangman");
		set1.add("goose");
		
		set1.remove("goose");
		
		System.out.println(set1);
		
		// 수정 불가능한 Set
		Set<String> set2 = Set.of("thor", "hulk", "batman");
//		set2.add("super");	// x
//		set2.remove("hulk");	// x
		
		// SET은 자바 8버전 이후라 높은 확률로 낮은 버전 쓰는 회사들에서 못씀
		System.out.println(set2.contains("thor"));	// 포함하는지 찾는 메소드
		System.out.println(set2.size());	// 사이즈를 묻는 메소드 // 둘다ok
		System.out.println(set2);
	}
}

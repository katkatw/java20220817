package ch16.lecture.p02stream;

import java.util.Arrays;

public class C15MethodReference { // lambda 에 관한 이야기
	public static void main(String[] args) {
		String[] arr1 = { "iron", "cap", "widow", "hulk", "panther" };
		
		System.out.println(Arrays.toString(arr1));
//		Arrays.sort(arr1, (a, b) -> a.compareTo(b)); // 뒤에 있는건 없어도 됨 natural 어쩌구
		Arrays.sort(arr1, String::compareTo);	// method reference // 역순으로 하고싶을땐 못씀
		System.out.println(Arrays.toString(arr1));
		
		
		Arrays.sort(arr1, (a, b) -> b.compareTo(a));
		System.out.println(Arrays.toString(arr1));
	}

}

package ch05.lecture.p02reference;

import java.util.Arrays;

public class C10Compare {
	// 그림 : 05.참조타입비교.png
	public static void main(String[] args) {
		int a = 3;
		int b = 3;
		
		System.out.println(a == b); // true 같은 값
		
		int[] c = new int [] {3, 4, 5};
		int[] d = new int [] {3, 4, 5};
		
		System.out.println(c == d); // false // 배열은 연산자로는 내용물 비교가 안된다
		// content 비교 => true
		System.out.println(Arrays.equals(c, d)); // true 
		
		int[] e = c; // e와 c의 참조값이 같다
		
		e[0] = 33;
		System.out.println(c[0]); // 33 // 그래서 변경됨
		
		System.out.println(e == c); // true
		System.out.println(Arrays.equals(c, d)); // false
	}
}

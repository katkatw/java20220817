package ch11.lecture.p03string;

public class C01String {	// https://en.m.wikipedia.org/wiki/File:ASCII-Table.svg
	public static void main(String[] args) {
		String s1 = "maverick"; 
		
		char[] arr1 = {'c', 'o', 'y', 'o', 't', 'e', '\u270d'}; // 2bytes로 표현할 수 있으면 다 담을 수 있다 // unicodeof페이지 활용
		
		String s2 = new String(arr1);
		System.out.println(s2);
		
		String s3 = new String(arr1);
		System.out.println(s3);
		
		byte[] arr2 = {106, 97, 118, 97};
		String s4 = new String(arr2);
		System.out.println(s4);
		
		String s5 = new String(arr2, 2, 2);
		System.out.println(s5);
	}
}

package ch11.book.s110701;

public class ByteToStringExample {
	public static void main(String[] args) {
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		
		String str1 = new String(bytes);
		System.out.println(str1);

		String str2 = new String(bytes, 6, 4); // bytes라는 바이트배열에서 6번째 번호부터 4개 프린트
		System.out.println(str2);
	}
}

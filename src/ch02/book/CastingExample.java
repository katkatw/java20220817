package ch02.book;

public class CastingExample {
	public static void main(String[] args) {
		int intValue = 44032; //int가 4바이트긴 하지만 44032는 2바이트라서
		char charValue = (char) intValue; //char에 변환해도 깨지지 않는다
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
	}
}

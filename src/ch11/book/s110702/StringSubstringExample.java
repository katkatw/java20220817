package ch11.book.s110702;

public class StringSubstringExample {
	public static void main(String[] args) {
		String ssn = "880815-1234567 ";
		
		String firstNum = ssn.substring(0, 6); // ssn.substring(a, b)는 a부터 해서 b "전까지의" 문자열을 추출하는 것
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
	}  
}

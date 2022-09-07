package ch11.book.s110702;

public class StringCharAtExample {
	public static void main(String[] args) {
		String ssn = "010624-1230123";
		char sex = ssn.charAt(7); // 0부터 시작하니까 charAt(7)은 주민번호 뒷맨앞글자
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자 입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자 입니다.");	
			break;
		}
	}
}

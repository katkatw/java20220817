package ch10.book.s100201;

public class NullCPointerExceptionExample {
	public static void main(String[] args) {
		String data = null;
		System.out.println(data.toString()); // 가리키고 있는 인스턴스가? 없는데 가리켜서 인셉션이 일어남
	}
}

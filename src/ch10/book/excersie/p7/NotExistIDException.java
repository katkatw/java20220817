package ch10.book.excersie.p7;

public class NotExistIDException extends Exception {
	public NotExistIDException() {}
	public NotExistIDException(String message) {
		super(message);			// 상위 클래스 생성자 호출!
	}
}

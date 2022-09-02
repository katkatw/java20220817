package ch09.book.s090502;

public interface RemoteControl {
	public void turnOn();
	public void turnOff();
	
	// 인터페이스 안에 추상메소드 2개
	// 이걸 대입하는 클래스들은 모두 2개를 다 재정의하고 써야함
}

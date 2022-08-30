package ch06.book.exercise.p19;

public class Account { // 상수로 쓰면 되는 것이었던.... MIN MAX
	// 필드
	private static final int MIN_BALANCE = 0;
	private static final int MAX_BALANCE = 1000000;
	private int balance;
	
	// 생성자
	
	// 메소드
	
	
	public void setBalance(int balance) {
		if (balance >= 0 && balance <= 1000000) {
			this.balance = balance;
		}
	}
	
	public int getBalance() {
		return balance;
	}

}
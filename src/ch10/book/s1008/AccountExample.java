package ch10.book.s1008;

import ch10.book.s100701.BalanceInsufficientException;
import ch10.book.s100702.Account;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		// 예금하기
		account.deposit(10000);
		System.out.println("예금액: " + account.getBalance());
		// 출금하기
		try {
			account.withdraw(30000);
		} catch (BalanceInsufficientException e) {
			String message = e.getMessage(); // e인스턴스가 갖고 있는 메소드중에 메세지를 꺼내오는 메소드도 있고
			System.out.println(message);
			System.out.println();
			e.printStackTrace(); // 얘도 있다
		}
	}
}

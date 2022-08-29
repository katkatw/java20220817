package ch06.book.exercise.p15;

public class MemberService {
	
	// 적어도 private은 아니다
	public boolean login(String id, String password) {
//		return id == "hong" && password == "12345";
		return id.equals("hong") && password.equals("12345");
	}
	
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}

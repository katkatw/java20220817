package ch10.book.excersie.p7;

public class LoginExample {
	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue", "54321");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void login(String id, String password) throws Exception { // throws 두개 콤마 해도됨
		
		// id가 "blue"가 아니라면 NotExistIDException 발생시킴
		if (!id.equals("blue")) {
			throw new NotExistIDException("아이디가 존재하지 않습니다.");	// 위에 e.getMessage에서 메세지 호출하니까 
		}																	// throw로 새로운 익셉션 만들때 바로 메세지 파라미터에 입력
		
		// password가 "12345"가 아니라면 WrongPasswordException 발생시킴
		if (!password.equals("12345")) {
			throw new WrongPasswordException("패스워드가 틀립니다.");
		}
	}
}

package ch10.lecture.p06message; 	// 447 페이지 내용 

public class C01Message {
	public static void main(String[] args) {
		System.out.println("메인 코드 1");
		method1();
		System.out.println("메인 실행 이어감~");
	}
	
	private static void method1() {
		System.out.println("메소드1 코드");
		try {
			method2();
		} catch (Exception e) {// 자동으로 나오는...
//			// TODO Auto-generated catch block
//			e.printStackTrace();

			// 캐치블럭을 빈칸으로 두면 오류를 볼 수 없게 됨 
			// 로그(메시지) 꼭 남기기
			System.out.println("익셉션 발생함!!");
			System.out.println(e.getMessage()); // 아래 throw new Exception이 여기서 나옴
			// 그래서 맨 위 자동완성으로 나왔던 e.printSrackTrace();를 쓰는게 낫다
			// 어디서 발생했는지 글이 뭔지 다나온다
		}
		System.out.println("메소드1 실행 이어감");
	}
	
	private static void method2() throws Exception {
		throw new Exception("어떤 이유로 발생했는지");
	}
}

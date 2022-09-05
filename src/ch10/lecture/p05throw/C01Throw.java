package ch10.lecture.p05throw;

public class C01Throw {
	public static void main(String[] args) {
		try {
			method1();
			
		} catch (RuntimeException e) {
			System.out.println("실행 예외 잡았다");
		}
		
		System.out.println("프로그램 실행 이어감.");
	}
	
	private static void method1() throws RuntimeException { // 내코드에서 예외를 시키고 싶을때 // 그리고 런타임은 써도되고 안써도 된다
		System.out.println("코드1");
		System.out.println("코드2");
		
		// 예외 발생
		// throw Exception
		throw new RuntimeException();
		
		
		
		
//		FileReader fr = new RileReader("");		
// 이 경우에는 예외를 발생시킬 수 있는 생성자를 생성한 것 

		
//		catch(exception e)		
//	참조값을 받았다는건 인스턴스를 생성했다는 것
		
	}
}

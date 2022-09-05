package ch10.lecture.p02try;

public class C07Catch { 
	public static void main(String[] args) {
		// catch블록은 순서가 상관 있음
		
		String[] arr = {"삼백"};
		
		try {
			int a = Integer.parseInt(arr[0]); // arrayoutofexception이나 numberexception 일어날 수 있음
			
			System.out.println(a);
			
			// 여러 catch 블럭 작성시
			// 상위 타입을 catch를 블럭을 먼저 쓸 수 없음
		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("wrong index !!!");
		} catch (Exception e) {
			System.out.println("wrong format@@@@");
//		} catch (ArrayIndexOutOfBoundsException a) { // 다형성에 의해 ArrayIndex도 Exception을 상속받는 애라서
//			System.out.println("wrong index !!!"); 	 // 상위타입이 먼저 실행되면 array도 계산 끝났기 때문에 ArrayIndex 실행 불가
		} 
	}
}

package ch04.lecture.p02method;

public class C07Return {
	public static void main(String[] args) {
		System.out.println(1);
		
		method1();
		
		System.out.println(2);
	}
//	이 위에만 프린트 값
	
	
//	public static void method5() {
	public static double method5() {
		return 5;
	}
	
//	public static void method4() {	
	public static double method4() {
		return 3.14;
	}

//	public static void method3() {
	public static String method3() {
		return "hello";
	}
	
//	public static void method2() { // void는 공허하다는 뜻 // 메소드 명 앞에 있는게 리턴타입
	public static int method2() { 
		// return : 메소드 종료
		// 			오른쪽 값을 호출한 곳으로 반환(return)
		// return으로 값을 반환할 때
		// 메소드의 리턴 타입과 반환값의 타입이 일치해야함
		
		return 3; 
	}
	
//	public static void method1() {
	public static void method1() {
		// return : 메소드 종료
		System.out.println("가");
		
		if (true) {
			return; 			  // 메소드 종료
		}
		
		System.out.println("나"); // 출력하려니까 위에 return으로 종료되서 에러뜸
		// 위에 if 넣으니까 또 작동됨
	}
}

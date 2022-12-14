package ch03.book;

public class ArithmeticOperatorExample {
	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println("result1=" + result1);
		
		int result2 = v1 - v2;
		System.out.println("result2=" + result2);
		
		int result3 = v1 * v2;
		System.out.println("result3=" + result3);
		
		int result4 = v1 / v2;	// int와 int의 결과값도 int이므로 2.5의 소수점자리는 나오지 않는다
		System.out.println("result4=" + result4);
		
		int result5 = v1 % v2;
		System.out.println("result5=" + result5);
		
		double result6 = ((double) v1) / v2;	// double과 int의 결과값은 double로 나온다
		System.out.println("result6=" + result6);
	}
}

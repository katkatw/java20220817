package ch02.lecture;

public class C06Double {
	public static void main(String[] args) {
		// 실수형
		// float(4 bytes)
		// double(8 bytes)
		// double이 float보다 큰범위, 더 정교한 표현 가능
		// 실수 literal은 double 형
		// float literal 표현은 끝에 F 붙임
		
		double a = 3.14;
		double b = 0.19874917239471;
		
		float c = 3.14F; // F안쓰면 double literal로 인식한다
		float d = 0.1983749179837491F;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		double f = 0.1; //우리가 작성한건 10진법이지만 저장은 2진법 //정수 소수 2로 곱나누는 2진법
		System.out.println(f);
		
//		0.0001100110011001100110011001100110011001100110011001100110011		
		double g = 0.2;
		
		double h = f + g;
		System.out.println(h);
	}
}

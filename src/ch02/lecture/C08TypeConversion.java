package ch02.lecture;

public class C08TypeConversion {
	public static void main(String[] args) {
		// 타입변환
		// 작은 타입에서 큰 타입으로는 자동 변환
		// 큰 타입에서 작은 타입으로는 강제 변환(cast 연산, casting)
		
		// 자동 형변환
		int a = 33;
		short b = 55;
		
		a = b; // 자동 형변환
		
		char x = '가';
		a = c;
		
		long d = c;
		
//		short e = c; // 안됨
		
		float f = 3.14F;
		double g = f;
		
		// 정수형 -> 실수형
		int h = 999;
		float i = h;
		double j = h;
		long k = 99999L;
		float l = k;
		double m = k;
		
		boolean n = true;
//		int o = n; // 안됨
		
		// 강제 형변환 (큰타입 -> 작은타입)
		long q = 999999L; 	// q는 8바이트, p는 4바이트
		int p = q;			// X 
		int r = (int)q; 	// 강제형변환 (cast, casting)
		System.out.println(r);
		
		q = 30_0000_0000L;
		r = (int) q; // (강제형변환) 값을 잃을 수 있다
		System.out.println(r);
		
		// 실수 -> 정수 (강제형변환)
		float s = 3.14F;
		int t = s; // X 안됨
		int u = (int)s;
		System.out.println(u);
		
		// 이건 가끔 쓰는 때가 있다
		double v = 3.14;
		u = (int) v; // 소수점 이하 탈락
		System.out.println(u);
	}
}

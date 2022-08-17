package ch02.lecture;

public class C04Integer {
	public static void main(String[] args) {
		// 정수 : byte(1), short(2), int(4), long(8)
		
		// 1byte == 8bit (0000 0000)
		// 0 ~ 255(1111 1111)
		// byte (2byte)
		// 0 ~ 127, -1 ~ -128 // -128 ~ 127 //앞부분이 1로시작하면 음수로 판단
		
		byte a = 0;
		byte b = 127;
		byte c = -128;
//		byte d = 128;
//		byte e = -129;
		
		// short (2 byte)
		// -32,768 ~ 32,767
		short f = -32768;
		short g = 32767;
//		short h = 32768;
//		short i = -32769;
		
		// int (4 bytes)
		// -2,147,483,648 ~ 2,147,483,647
		int j = -2147483648;
		int k = 2147483647;
		int l = -300000000;
		int m = 300000000;
		
		// long (8 bytes)
		// 매우 큰값
		long o = 220000000L;  //소문자 l 대문자 L 사용가능
		long p = -300000000;
		
		// 정수 literal 작성시 주의 할 점
		// 정수 literal은 int로 취급
		// 범위를 넘어갈 땐 long타입으로 표시 (대문자 L)
		// 작성하는 수가 클 땐 _와 조합 가능
		
		long q = 2_100_000_000;
		long r = 21_0000_0000;
		
		// 연산시 overflow 주의
		int s = 2147483647;
		
		int t = s + 1; // 2147483648 가 되지 않고 -2147483648로 바뀐다 // int는 4 byte
		// 더해지지 않고 음수로 변하는 넘처흐르는 변환값 // 이럴땐 int말고 long을 썼어야
		System.out.println(t);
		
		
		
	}
}

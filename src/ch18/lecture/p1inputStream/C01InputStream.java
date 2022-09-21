package ch18.lecture.p1inputStream;							// 스트림의 4가지 종류중 input 스트림의 read 메소드

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class C01InputStream {
	public static void main(String[] args) throws Exception {
		// InputStream : 프로그램 기준으로 입력 받는 객체를 만드는 클래스
		// 입력 단위 : byte
		
//		InputStream is = new InputStream(); // 추상클래스라 안됨
		
		String path = "src/ch18/lecture/p1inputStream/C01InputStream.java"; // 파일 경로
		InputStream is = new FileInputStream(path);
		
		// 주요 메소드 read
		// read() : 한 바이트 읽기
		int r1 = is.read(); // 리턴타입 인티저... 인티저 4바이트가 1로..
		int r2 = is.read();
		int r3 = is.read();
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		
		is.close(); // 자원 사용 후 닫기 (꼭)     // 컴퓨터할때 닫으려해도 어디서 쓰고 있다고 못닫는 예 *
	}
}

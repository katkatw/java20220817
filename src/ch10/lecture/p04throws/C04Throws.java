package ch10.lecture.p04throws;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class C04Throws {
	public static void main(String[] args) throws FileNotFoundException {
		
		method1();
	}
	
	private static void method1() throws FileNotFoundException {
		// try/catch 사용하지 않고 컴파일 되도록 코드 수정
		InputStream is = new FileInputStream("");
	}
}

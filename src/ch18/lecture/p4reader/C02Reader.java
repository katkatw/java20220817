//한글
package ch18.lecture.p4reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;

public class C02Reader {
	public static void main(String[] args) throws Exception {
		// InputStream(바이트 단위)과 비교
		
		String fileName = "src/ch18/lecture/p4reader/C02Reader.java";
		InputStream is = new FileInputStream(fileName);
		
		int r1 = is.read();
		int r2 = is.read();
		int r3 = is.read();
		int r4 = is.read();
		
		System.out.println((char)r1); // /
		System.out.println((char)r2); // /
		System.out.println((char)r3); // 한
		System.out.println((char)r4); // 글 이어야 하는데 byte단위로 읽으니 한글은 1바이트 이상이라 깨져서 나옴
		
		is.close();
		
		
		
		// 문자 단위 스트림 사용
		Reader rd = new FileReader(fileName);
		
		int i1 = rd.read(); 
		int i2 = rd.read();
		int i3 = rd.read(); 
		int i4 = rd.read();
		
		System.out.println((char)i1); // /
		System.out.println((char)i2); // /
		System.out.println((char)i3); // 한
		System.out.println((char)i4); // 글
		
		rd.close();
	}
}

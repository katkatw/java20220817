//한글
package ch18.lecture.p6filter;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class C01InputStreamReader {
	public static void main(String[] args) throws Exception {
		String name = "src.ch18/lecture/p6filter/C01InputStreamReader.java";
		
		FileInputStream fis = getFileInputStream(name);
		Reader rd = new InputStreamReader(fis); // 파일인풋스트림을 감싼 스트림이 새롭게 만들어진 것
		// 파일인풋스트림을 리더로 바꾸는 식
		
//		int c1 = fis.read();
//		int c2 = fis.read();
//		int c3 = fis.read();
		
		int c1 = rd.read();
		int c2 = rd.read();
		int c3 = rd.read();
		
		System.out.println((char) c1);
		System.out.println((char) c2);
		System.out.println((char) c3);
		
		fis.close();
	}
	
	private static FileInputStream getFileInputStream(String fileName) throws Exception { // 리더로 바꿔달라 하던가
		
		return new FileInputStream(fileName);
	}
}

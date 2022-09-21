package ch18.lecture.p2outputStream; // 윈도우에서 폴더 나뉠때 / 인데 자바에서는 \\로 뜸

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class C01OutputStream {					// outputstream도 추상클래스라 얘로는 객체 못만듬
	public static void main(String[] args) throws Exception {
		// OutputStream : 바이트 단위로 출력하는 스트림
		// 주요 메소드 : write
		
		String name = "C:\\Users\\user\\Desktop\\output\\output1.txt"; // 파일이름
		OutputStream os = new FileOutputStream(name);
		
		// write() : 한바이트 출력 메소드
		os.write(0);
		os.write(127);
		os.write(-128);
		
		os.close();
	}
}

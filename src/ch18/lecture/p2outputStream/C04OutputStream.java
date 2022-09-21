package ch18.lecture.p2outputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class C04OutputStream {
	public static void main(String[] args) throws Exception {
		String inFile = "src/ch18/lecture/p2outputStream/C04OutputStream.java";
		String outFile = "C:\\Users\\user\\Desktop\\output\\output4.txt";
		
		FileInputStream fis = new FileInputStream(inFile);
		FileOutputStream fos = new FileOutputStream(outFile);
		
		// 파일 복사 코드
		byte[] b = new byte[10];
		int len = 0; // 몇개 읽었는지 받는 코드
		
		while ((len = fis.read(b)) != -1) {
			fos.write(b, 0, len);
		}
		
		fis.close();
		fos.close();
	}
}

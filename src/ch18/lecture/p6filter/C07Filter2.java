package ch18.lecture.p6filter;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class C07Filter2 {
	public static void main(String[] args) throws Exception {
		String inFile = "C:\\\\Users\\\\user\\\\Desktop\\\\output\\\\output12.txt";
		String outFile = "C:\\\\Users\\\\user\\\\Desktop\\\\output\\\\output13-1.txt";
		
		FileInputStream fis = new FileInputStream(inFile);
		FileOutputStream fos = new FileOutputStream(outFile);
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		byte[] b = new byte[10];
		int len = 0; // 몇개 읽었는지 받는 코드
		
		while ((len = fis.read(b)) != -1) {
			fos.write(b, 0, len);
		}
		
		fis.close();
		fos.close();
		osw.close();
		bw.close();
	}
}

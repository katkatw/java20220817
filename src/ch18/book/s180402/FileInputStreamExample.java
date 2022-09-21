package ch18.book.s180402;

import java.io.FileInputStream;

public class FileInputStreamExample {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("src/ch18/book/s180402/FileInputStreamExample.java");
			
			int data;
			while ((data = fis.read() ) != -1) { // 할당연산의 결과 data
				System.out.write(data);			// System.out OutPutStream이다
			}
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

package ch18.book.s180404;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderExample {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("src/ch18/book/s180404/FileReaderExample.java");
		
		int readCharNo; // 몇개 읽었는지 저장할 변수
		char[ ] cbuf = new char[100]; // 문자단위로 넣을 배열
		while ((readCharNo = fr.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo); // new string생성자로 string data에 만듬
			System.out.println(data);
		}
		fr.close();
	}
}

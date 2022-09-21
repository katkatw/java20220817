package ch18.book.s180405;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\user\\Desktop\\output\\output8.txt");
		FileWriter fw = new FileWriter(file, true);
		fw.write("FileWriter는 한글로 된 " + "\r\n");			// 캐리지리턴 엔터
		fw.write("문자열을 바로 출력할 수 있다." + "\r\n"); 	// \r\n : enter (윈도우용)
		fw.flush();
		fw.close();
		System.out.println("파일에 저장되었습니다.");
	}
}

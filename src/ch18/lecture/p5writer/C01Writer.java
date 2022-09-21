package ch18.lecture.p5writer; // char 2 int 4바이트 이므로 char는 int로 자동형변환

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class C01Writer {
	public static void main(String[] args) throws Exception {
		// Writer : 문자단위로 출력하는 스트림
		// 주요 : write
		
		String fileName = "C:\\Users\\user\\Desktop\\output\\output5.txt";
		Writer wr = new FileWriter(fileName);
		
		// write(int) : 문자 하나 출력하는 메소드
		wr.write('a');
		wr.write('b');
		wr.write('한'); // 자바안에서는 2바이트인데 파일에선 3바이트라고 나옴
		wr.write(9742);
		
		wr.close();
	}
}

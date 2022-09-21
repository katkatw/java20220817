package ch18.lecture.p5writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class C03Writer {
	public static void main(String[] args) throws Exception {
		String fileName = "C:\\Users\\user\\Desktop\\output\\output7.txt";
		Writer wr = new FileWriter(fileName);
		
		char[] buf = {'a', 'b', 'c', 'd', '가', '나', '다', '라'};
		// write(배열, 몇번, 몇개) 
		// char?배열 몇번?째부터 몇?개
		wr.write(buf, 0, 3); // abc
		wr.write(buf, 2, 4); // cd가나
		
		wr.close();
	}
}

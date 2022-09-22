package ch18.lecture.p6filter;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class C05Filter {
	public static void main(String[] args) throws Exception {
		String name = "C:\\Users\\user\\Desktop\\output\\output12.txt";
		OutputStream os = new FileOutputStream(name);
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw); // 여러 스트림을 겹쳐서 쓸 수 있다.
		
		for (int i = 0; i < 100000; i++) {
			bw.write("오징어게임");
			bw.write("\n"); // 한줄 띄워쓰기
		}
		
		bw.close();
		osw.close();
		os.close();
	}
}

package ch18.book.s180504;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:\\Users\\user\\Desktop\\output\\output15.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.println("[프린터 보조 스트림]");
		ps.println("마치 ");
		ps.println("프린터가 출력하는 것처럼 ");
		ps.println("데이터를 출력합니다.");
		
		ps.flush(); // 버퍼를 사용하는 스트림들은 버퍼에 채워진 후 다차면 목적지에 전송되는데 flush는 그전에 보내는 메소드이다.
		ps.close();	// close 자체도 flush 쓰긴 하는데 안전하게 하기위해 위에서 flush 쓰는 것
		fos.close();

	}
}

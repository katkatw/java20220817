package ch18.lecture.p3exception;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class C02Exception {
	public static void main(String[] args) {
		try {
			String name = "C:\\Users\\user\\Desktop\\output\\output5.txt";
			OutputStream os = new FileOutputStream(name);
		
			os.write(99); 
			os.write(88);
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 꼭 실행해야 하는 코드는 finally 블럭에 작성
//			os.close(); // 또 문제생김
			try {
				if (os != null) {
					os.close();
				}
			} catch (IOException e2) {
				e.printStackTrace();
			}
			
			is.clo
		}
	}
}

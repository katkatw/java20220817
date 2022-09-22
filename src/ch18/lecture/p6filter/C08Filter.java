package ch18.lecture.p6filter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class C08Filter {
	public static void main(String[] args) {
		String name = "C:\\Users\\user\\Desktop\\output\\output14.txt";
		
		try (
				FileOutputStream  fos = new FileOutputStream(name);
				PrintStream ps = new PrintStream(fos);) {
			
			ps.write(97);
			ps.print(97);
			
			ps.println(3.14);
			ps.println('가');
			ps.println(true);
			
			System.out.println("hello world");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

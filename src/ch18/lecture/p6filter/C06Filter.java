package ch18.lecture.p6filter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class C06Filter {
	public static void main(String[] args) throws Exception {
//		FileInputStream
//		InputStreamReader
//		BufferedReader
//		위 세개의 stream 연결해서 
//		output12.txt 파일 읽는 코드 작성 ------------------------------------------
		
//		String name = "C:\\Users\\user\\Desktop\\output\\output12.txt";
//		InputStream is = new FileInputStream(name);
//		InputStreamReader isr = new InputStreamReader(is);
//		BufferedReader br = new BufferedReader(isr);
//		
//		String line = null;								// String이랑 While문 못씀
//		
//		while ((line = br.readLine()) != null) {
//			System.out.println(line);
//		}
//		br.close();
//		isr.close();
//		is.close(); ---------------------------------------------------------------
		
		String name = "C:\\Users\\user\\Desktop\\output\\output12.txt";
		try (	
				InputStream is = new FileInputStream(name);
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);
				) {
			String line = null;			
			
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}										// 이렇게 하면 close(); 안써도 됨
		
	}

	private static FileInputStream getFileInputStream(String fileName) throws Exception {
		
		return new FileInputStream(fileName);
	}
}

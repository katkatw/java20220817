package ch18.lecture.p3exception; // try with resource

import java.io.PrintWriter;
import java.util.Scanner;

public class C04Exception {
	public static void main(String[] args) {
		// 생성시 checked exception 처리하지 않아도 되고
		// 다시 할당하는 코드가 작성되지 않는다면 (final) (* effectively final 사실상 파이널도)
		// try 블럭 전에 선언 및 할당하고
		// try () 변수명 나열할 수 있음
		// java 9부터 가능
		
		final Scanner scanner = new Scanner(""); // 어쩌구 되니까? final 붙이고
		PrintWriter pw = new PrintWriter(System.out); // * final이 아니어도 다시 할당하는 코드를 작성하지만 않으면 아래 try()안에 쓸 수 있음!!
		
		try (scanner; pw;) { // () 안에 변수명 넣어주면 
			// 일 함...
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

package ch06.lecture.p06package;

//import static java.lang.Math.PI;
//import static java.lang.Math.random;
import static java.lang.Math.*;
import static java.lang.Integer.*;

public class C04StaticImport {
	public static void main(String[] args) {
		double r = Math.random();
		System.out.println(r);
		
		System.out.println(Math.PI);
		System.out.println(PI); // 위에 import하면 Math. 생략가능
		
		System.out.println(random());
		
		// integer 임포트한 값
		System.out.println(MAX_VALUE);
		System.out.println(MIN_VALUE);
	}
}

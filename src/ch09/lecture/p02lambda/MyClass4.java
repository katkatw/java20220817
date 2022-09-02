package ch09.lecture.p02lambda;

public class MyClass4 {	
	public static void main(String[] args) { 
		MyInterface4 o1 = (String s, int a) -> System.out.println(s.repeat(a)); 
		MyInterface4 o2 = (s, a) -> System.out.println(s.repeat(a)); 
		
//		MyInterface4 o3 = s, a -> System.out.println(s.repeat(a)); //  파라미터가 여러개인 경우는 () 생략 불가   
		
		o1.method("top", 2);
		o2.method("java", 3);
	}
}

interface MyInterface4 {
	void method(String s, int b);
}
//  	추가내용 : 파라미터가 a든 b든 같은게 나온다.


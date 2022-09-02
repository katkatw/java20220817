package ch09.lecture.p02lambda;

public class MyClass3 {
public static void main(String[] args) {
	MyInterface3 o1 = (String s) -> System.out.println(s); 
	
	o1.method("hello");
	o1.method("java");
	
	// 파라미터 타입도 인터페이스에 정의된 것으로 추론 가능하므로
	// 생략 가능     (이거)
	MyInterface3 o2 = (s) -> System.out.println(s.repeat(2)); 
	o2.method("top");
	o2.method("gun");
	
	// 파라미터가 하나일 때는 ()도 생략 가능
	MyInterface3 o3 = s -> System.out.println(s.repeat(3)); 
	o3.method("coyote");
	o3.method("bob");
  }
}


interface MyInterface3 {	
	void method(String s);
}
package ch06.lecture.p04static;

public class MyClass2 {
	// (instance) field
	String name;
	
	// static field
	static String company = "topgun";
	static int rank;
	
	static { // static에 연산이나 복잡한 결과가 필요하면 여기다 씀
		int a = 30;
		int b = 90;
		rank = a * b;
	}
	
	static {
		// 여러개 있어도 상관없고 순서대로 실행된다
	}
	
	
	public MyClass2(String name) {
		this.name = name;
	}

}

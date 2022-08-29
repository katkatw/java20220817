package ch06.lecture.p04static;

public class MyClass1 {
	// non static field (인스턴스 필드)
	String name;
	
	// static field
	// class field (인스턴스가 아닌 클래스 필드)
	static String company;
	
	// 생성자 constructor
	public MyClass1(String name) {
		this.name = name;	// 파란게 필드 갈색이 생성자
	}
	
	// non static method
	// (instance) method
	void printName() {
		System.out.println(name);
	}
	
	// non static method
	// (class) method
	static void printCompany() {
		System.out.println(company);
	}

}

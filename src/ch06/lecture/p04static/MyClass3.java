package ch06.lecture.p04static;

public class MyClass3 {
	// instance field
	String name;
	
	// static field // 스태틱은 인스턴스가 아닌 클래스의 정보
	static String company = "topgun";
	public MyClass3(String name) {
		this.name = name; // 앞으로 만들어질 인스턴스의 참조값을 대신하는 this
	}
	
	// static method
	static void printCompany() {
		// static member는 instance member에 접근할 수 없음
		// 반대는 가능함!
//		System.out.println(this.company);	// 안됨 xxx
		System.out.println(company);
	}
	
	// instance method
	void printName() {
		System.out.println(this.name);
	}
	
	void showCompany() {
		// instance member에서 static member 접근 가능
		System.out.println(company);
		// member = field & method
	}
	
	void someInstanceMethod() {
		// this는 instance 멤버 접근시 사용 가능
		System.out.println(this.name);
		this.printName();
		printName();
	}
}

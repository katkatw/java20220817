package ch06.lecture.p02constructor;

public class MyClass4 {
	// fields
	String name;
	int age;
	
	// constructors
	public MyClass4(String name, int age) {
		//name = name; // 사람은 이게 필드 컨스트럭트에 따로 있는 name인걸 알지만
		// 컴퓨터는 모르기 때문에 가장가까운 name를 찾아서
		// 컨스트럭터 안에 있는 name은 모두 컨스트럭터의 것인줄 안다
		
		// this : 앞으로 만들어질 객체의 참조값
		this.age = age; 
		this.name = name;	
	}
}

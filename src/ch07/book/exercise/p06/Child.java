package ch07.book.exercise.p06;

public class Child {
	private String name;
	
	public Child() {
		this("홍길동");
		System.out.println("Child() call");
	}
	
	public Child(String name) {
//		super(); 상위 클래스 호출
		this.name = name;
		System.out.println("child(String name) call");
	}
}

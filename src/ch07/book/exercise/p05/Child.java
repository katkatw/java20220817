package ch07.book.exercise.p05;

public class Child extends Parent {
	private int studentNo;
	
	public Child(String name, int studentNo) {
//		super(""); // 부모클래스의 생성자 생성
//		this.name = name;
		super(name);
		this.studentNo = studentNo;
	}
}

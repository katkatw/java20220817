package ch06.book;

public class MyClass2 {
	// field는 특별한 이유가 없으면 private
	private String name;
	private int age;
	private boolean alive;
	
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	// boolean 타입 getter는 is로 쓰는 관습이 있다.
	public boolean isAlive() { // boolean type getter는 is로 작성
		return alive;
	}
	
	// 대신 getter, setter method 공개(public)
	// 읽기만 할거면 set메소드 없애면 된다 getter읽기 setter쓰기
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
}

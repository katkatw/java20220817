package ch07.lecture.p03abstract;

public abstract class SuperClass2 {
	// 추상메소드
	// body가 없는 메소드
	// 상속받는 클래스가 꼭 구현해야함
	// 추상메소드가 있는 클래스는 꼭 추상클래스여야 함 
	// 추상클래스엔 정의할 수 없지만 다른데서 정의됐으면 할 때...
	public abstract void cry(); 
	
	
	public void walk() {
		System.out.println("네발로 걷습니다.");
	}
	
	public void eat() {
		System.out.println("밥을 먹습니다.");
	}
}

package ch07.lecture.p03abstract;

public class SubClass2 extends SuperClass2 {
	
	@Override
	public void cry() {
		System.out.println("왈왈");
	}
	// SuperClass2에서는 abstract(추상)메소드 였지만
	// SubClass2에서는 몸통이 있기 때문에 그냥 public void cry
	
	@Override
	public void eat() {
		System.out.println("사료를 먹습니다.");
	}
}

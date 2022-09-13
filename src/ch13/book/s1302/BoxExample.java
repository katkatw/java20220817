package ch13.book.s1302;

public class BoxExample {
	public static void main(String[] args) {
		/* 656페이지
		Box box = new Box();
		box.set("홍길동");
		String name = (String) box.get(); // obj는 str이 아니므로 강제 형변환 // 위험
		
		box.set(new Apple());
		Apple apple = (Apple) box.get(); // apple은 새로만든 클래스 // obj // get의 리턴타입은 obj니까 apple로 강제형변환
		*/// 이걸 해결한게 generic 타입
		
		Box<String> box = new Box<String>();
		box.set("hello");
		String str = box.get();
		
		Box<Apple> box2 = new Box<Apple>();
		box2.set(new Apple());
		Apple a = box2.get();
	}
}

package ch07.lecture.p03abstract;

public class C01Abstract {	// 인스턴스
	public static void main(String[] args) {
		SubClass1 o1 = new SubClass1(); // o
//		SuperClass1 o2 = new SuperClass1(); // ok 였다가 아니게 됨 // SuperClass1에 abstract 추가해서!
		
		SuperClass1 o3 = new SubClass1(); // 참조변수 타입은 참조변수 타입으로 만들 수 있다.
	}

}

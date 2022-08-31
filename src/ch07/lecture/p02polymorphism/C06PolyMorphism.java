package ch07.lecture.p02polymorphism;

public class C06PolyMorphism {
	public static void main(String[] args) {
		SubClass3 o1 = new SubClass3();
		
		SuperClass3 o2 = o1;
		
		System.out.println(o2 == o1); // true
		System.out.println(System.identityHashCode(o1));
		System.out.println(System.identityHashCode(o2));
		
		o1.method1();
		o2.method1(); // 실제 가리키고 있는 인스턴스 메소드를 실행한다 // 추상개념이 아닌 실제의 것
		
		SuperClass3 o3 = new SuperClass3();
		o3.method1();
	}
}

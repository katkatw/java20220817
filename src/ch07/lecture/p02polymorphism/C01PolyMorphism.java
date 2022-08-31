package ch07.lecture.p02polymorphism;

public class C01PolyMorphism {
	public static void main(String[] args) {
		// 자동형변환
		
		SubClass1 o1 = new SubClass1(); // 실제 인스턴스는 SubClass1이다. 
		SuperClass1 o2 = new SubClass1();
		SuperClass1 o3 = new SubClass2();
		
		SuperClass1 o4 = o1; // o1이 서브클래스?
		
		// 거꾸로는 안됨
		SuperClass1 o5 = new SuperClass1();
//		SubClass1 o6 = new SuperClass1(); // x // 수퍼클래스에 있는걸 서브클레스에 넣을수 없다
//		SubClass1 o7 = new SuperClass1(); // x
		
//		SubClass1 o8 = o4; // x 수퍼클래스 o4를 서브클래스 o8에 넣을 수 없다. 
		// 강제형변환은 됨!
		
		
		// 표범을 생각해보면 수퍼클래스 표범과 서브클래스 얼룩무늬표범
		// 표범이 얼룩무늬 표범일 수는 없다. 수퍼클래스가 서브클래스에 삽입될 수 없다.
		// 수퍼클래스는 추상화된 존재고 서브클래스는 실체다
	}
}

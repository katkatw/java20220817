package ch13.lecture.p03bound;

public class C01Bound {
	public static void main(String[] args) {
		MyClass1<Object> o1 = new MyClass1<>();
		MyClass1<String> o2 = new MyClass1<>();
		MyClass1<Number> o3 = new MyClass1<>();
		MyClass1<Integer> o4 = new MyClass1<>();
		
		MyClass2<Number> o5 = new MyClass2<>();
		MyClass2<Integer> o6 = new MyClass2<>();
		MyClass2<Double> o7 = new MyClass2<>();
		
// 		제한된 타입 파라미터의 경우
//		MyClass2<String> o8 = new MyClass2<>(); // Number와 관계 없는 것도 안되고
//		MyClass2<Object> o9 = new MyClass2<>(); // 상위 타입도 안된다
	}
}

class MyClass1<T> {
	
	public void method1(T p) { // T타입을 받는 메소드1     // MyClass1의 T에 뭐가들어오든 Object는 다 호환가능
		p.toString();
		p.equals(null);
		p.hashCode();
		
//		// T가 number타입이라는 보장이 없다
//		p.doubleValue(); // x
		
		Number n = (Number) p;
		n.doubleValue();
		// 하지만 이렇게 강제 형변환 하고 싶지 않으면 MyClass2 사용
	}
}

// 제한된 타입 파라미터
// bounded type parameter // Number 하위타입 것들만 받을 수 있는
class MyClass2<T extends Number> {
	public void method1(T p) {
		p.doubleValue();
		p.intValue();
		p.byteValue();
	}
}
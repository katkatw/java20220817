package ch06.lecture.p03method;

public class C04Return {
	public static void main(String[] args) {
		MyClass4 o1 = new MyClass4();
		
		o1.method1(); // 리턴후의 이 안의 값은 사라진다??
		o1.method2();
		
		System.out.println(o1.method2());
		
	// long float double int
		int b = o1.method2();
		long c = o1.method2();
		float d = o1.method2();
		double e = o1.method2();
		
	}
}
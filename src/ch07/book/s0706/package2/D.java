package ch07.book.s0706.package2;
import ch07.book.s0706.package1.A;

public class D extends A {
	public D() {// super : 상위클래스의 생성자 호출!
		super();				// (o)
		this.field = "value";	// (o)
		this.method();			// (o)
	}
}

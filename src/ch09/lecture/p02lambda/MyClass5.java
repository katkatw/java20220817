package ch09.lecture.p02lambda;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
public class MyClass5 {
	public static void main(String[] args) {
		IntConsumer o1 = s -> System.out.println(s * s);
		
		
		o1.accept(3); // 9
		o1.accept(4); // 16
		o1.accept(10); // 100
		
		DoubleConsumer o2 = s -> System.out.println(s/2);;
		
		o2.accept(5); // 2.5 출력
		o2.accept(10); // 5.0 출력
		o2.accept(7); // 3.5 출력
		
	}
}

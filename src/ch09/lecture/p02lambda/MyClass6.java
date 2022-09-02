package ch09.lecture.p02lambda;

public class MyClass6 {
	public static void main(String[] args) {
//		01번
		MyInterface6 o1 = () -> {
			int d = (int) (Math.random() * 6) + 1;
			return d;
		};
		
		int n1 = o1.method(); 				// 이거
		System.out.println(n1); 			// 두개나
		
		System.out.println(o1.method());	// 이거 하나 쓰는거나
											// 같음
		
		
		
		
//		02번	
		MyInterface6 o2 = () -> {
			return (int) (Math.random() * 6) + 1;
		};
		System.out.println(o2.method());
		
		
		
		
		
		
//		03번		
		MyInterface6 o3 = () -> (int) (Math.random() * 6) + 1;
		System.out.println(o3.method());
		
	}
}

interface MyInterface6 {
	int method();
}

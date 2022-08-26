package ch06.lecture.p02constructor;

public class C03Constructor {
	public static void main(String[] args) {
		MyClass3 o1 = new MyClass3("iceman", 77);
		System.out.println(o1.name); // "iceman"
		System.out.println(o1.age); // 77
		
		MyClass3 o2 = new MyClass3("maverick", 66);
		System.out.println(o2.name); // "maverick"
		System.out.println(o2.age); // 66
		
//		MyClass3 o3 = new MyClass3(); // x (파라미터 없는 생성자를 사용할 수 없음)
		// 이미 MyClass3에서 생성자를 직접 작성했기 때문에 자동생성자 불가능
	}
}

package ch06.lecture.p04static;

public class C01Static {
	public static void main(String[] args) {
		MyClass1 o1 = new MyClass1("coyote");
		o1.printName();
		
		MyClass1 o2 = new MyClass1("phoenix");
		o2.printName();
		
		o1.company = "topgun";
		System.out.println(o1.company);
		System.out.println(o1.name);
		
		System.out.println(o2.company);
		System.out.println(o2.name);
		
		o1.company = "bottomgun";
		System.out.println(o1.company);
		System.out.println(o2.company);
		
		o1.name= "maverick";
		System.out.println(o1.name);
		System.out.println(o2.name);
		
		// 위에 예시보다는 클래스 필드를
		// 보통 이렇게 직접적으로 저장함
		MyClass1.company = "middlegun";
		System.out.println(o1.company);
		System.out.println(o1.company);
		System.out.println(MyClass1.company);
		
		MyClass1.printCompany(); // 일반적인 
		o1.printCompany(); // 흔치 않은 방법
		

	}
}

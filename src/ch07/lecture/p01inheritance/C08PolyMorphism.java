package ch07.lecture.p01inheritance;

public class C08PolyMorphism {
	public static void main(String[] args) {
		String a = "maverick";
		
		System.out.println(a.length());
		
		Object b = "coyote";
		
//		System.out.println(b.length());
	
		String c = (String) b; // 강제형변환 (casting)
		System.out.println(c.length());
	}
}

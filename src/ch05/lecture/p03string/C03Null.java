package ch05.lecture.p03string;

public class C03Null {
	public static void main(String[] args) {
		// 참조하고 있는 객체가 없을 때는  Null이 들어감
		// 근데 입력안하면 작동안한다?
		int[] a;
		String b;
		String c = "java";
		
		
		a = null;	// 참조하는 객체가 없음
		b = null;	// 참조하는 객체가 없음
		
		System.out.println(c.length());
		System.out.println(b.length());
		
		
	}
}

package ch11.lecture.p03string;

public class C06ReplaceAll {
	public static void main(String[] args) {
		String s1 = "hashcode is a code of instance";
		String t1 = s1.replace("code", "코드"); // 원본이 바뀐게 아니라 바뀐걸 리턴
		
		System.out.println(t1);
		
		String t2 = s1.replaceAll("code", "코드"); // replace는 패턴을 받는다
		
		System.out.println(t2);
		
		String t3 = s1.replace(".{3}e", "코드");
		System.out.println(t3);
	}
}

package ch11.lecture.p03string;

public class C05Replace {
	public static void main(String[] args) {
		String s1 = "coyote";
		
		String s2 = s1.replace('o', 'z'); // s1은 바뀌지 않고 바뀐걸 리턴해주는 것
		System.out.println(s1);
		System.out.println(s2);
		
		String s3 = "hashcode is code of";
		String s4 = s3.replace("code", "kode"); // 스트링에 캐릭터 넣을 수 있음 
		System.out.println(s3);			// s3은 바뀌지 않고 바뀐걸 리턴해주는 것
		System.out.println(s4);
	}
}

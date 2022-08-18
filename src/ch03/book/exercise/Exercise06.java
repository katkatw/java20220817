package ch03.book.exercise;

public class Exercise06 {
	public static void main(String[] args) {
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
//		double area = (lengthTop + lengthBottom) * height / 2;		// 이렇게 하면 다 int여서 소수점까지 안나옴
		
		// 소수점까지 나오는 방법 2가지
		double area = (lengthTop + lengthBottom) * height / 2.0;			// 2.0 이나 (double) 추가
		//double area = (lengthTop + lengthBottom) * (double) height / 2;
		System.out.println(area);
	}
}

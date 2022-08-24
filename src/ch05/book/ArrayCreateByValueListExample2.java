package ch05.book;

public class ArrayCreateByValueListExample2 {
	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {83, 90, 87};
		int sum1 = 0;
// 		sum1 += scores[0];
// 		sum1 += scores[1];
// 		sum1 += scores[2];
		
		for (int i = 0; i < 3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1);
		
		
		int sum2 = add( new int[] {83, 90, 87}); // 이걸 담기위해 아래 public static 새로만듬
		System.out.println("총합 : " + sum2);
		System.out.println();
	}
	
	public static int add(int[] scores) { // int배열을 받는 메소드 // 들어올 int보다 작은 short나 int를 써야함 
		int sum = 0;
// 		sum += scores[0];
// 		sum += scores[1];
// 		sum += scores[2];
		
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		return sum;
	}
}

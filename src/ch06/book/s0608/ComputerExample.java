package ch06.book.s0608;

public class ComputerExample {
	public static void main(String[] args) {
		Computer myCom = new Computer();
		
		int[] values1 = {1, 2, 3};  // sum1은 배열형식
		int result1 = myCom.sum1(values1);
		System.out.println("result1: " + result1);
		
		
		int result2 = myCom.sum1(new int[] {1, 2, 3, 4, 5}); // sum2 콤마
		System.out.println("result2: " + result2);
		
		
		int result3 = myCom.sum2(1, 2, 3);
		System.out.println("result3: " + result3);
		
		
		int result4 = myCom.sum2(1, 2, 3, 4, 5);
		System.out.println("result4: " + result4);
	}
}

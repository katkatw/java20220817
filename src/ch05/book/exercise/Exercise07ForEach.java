package ch05.book.exercise;

public class Exercise07ForEach {
	public static void main(String[] args) {
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		for (int i : array) { 
			if (max < i) {
				max = i;
			}
		}

		int min = 0;
		
		for (int i : array) {
			if (min > i) {
				min = i;
			}
		}
		
		System.out.println("max: " + max); // 8
		System.out.println("min: " + min); // 1
		
	}
}

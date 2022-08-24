package ch05.lecture.p01array;

public class C09Array {
	public static void main(String[] args) {
		int[][] a = {{3, 4}, {7, 8}, {99, 98}}; // a의 아이템의 갯수는 총 3개
		int[][] b = {{1, 2, 3}, {4, 5, 6}};
		
		System.out.println(a.length); // 3
		System.out.println(b.length); // 2
		
		System.out.println(a[0].length); // 2
		System.out.println(a[1].length); // 2
		System.out.println(a[2].length); // 2
		
		System.out.println(b[0].length); // 3
		System.out.println(b[1].length); // 3
		System.out.println(b[2].length); // 3
		
		int[] c = new int[3];
		int[][] d = new int[2][3];
		
		// {}, {} 2개 그안에 a, b, c
		System.out.println(d.length); // 2
		System.out.println(d[0].length); // 3
		System.out.println(d[1].length); // 3
		

		int[][] e = new int[3][];
		System.out.println(e.length); // 3
//		System.out.println(e[0].length); // Exception

	}
}

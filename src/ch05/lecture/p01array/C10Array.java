package ch05.lecture.p01array;

public class C10Array {
	public static void main(String[] args) {
		int[][] a = {{3, 4, 5}, {1, 2, 3}};
		int[][] b = new int[2][3]; // 아이템의 아이템의 값은 0이다
		int[][] c = new int[3][]; // null, null
		
		System.out.println(b[0][0]);
		System.out.println(b[0][1]);
		System.out.println(b[0][2]);
		
		b[0][0] = 9;
		b[0][1] = 88;
		b[0][2] = 99;
		
//		c[0][0]; 이건 안되는 이유 // new int[3][]; 아이템의 수가 안뜨기 때문이다?? 행안의 열?
		c[0] = new int[] {99, 88};
		System.out.println(c[0][0]); // 99
		System.out.println(c[0][1]); // 88
		
		c[1] = new int[] {200, 100};
		System.out.println(c[1][0]); // 200
		System.out.println(c[1][1]); // 100
		
		c[2] = new int[] {-1, -2};
		System.out.println(c[2][0]); // -1
		System.out.println(c[2][1]); // -2
		
		
		
		
	}
}

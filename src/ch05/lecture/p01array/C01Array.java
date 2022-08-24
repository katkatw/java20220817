package ch05.lecture.p01array;

public class C01Array {
	public static void main(String[] args) {
		// array : 여러 값을 저장하는 공간
		// 타입[]

		//int들을 저장할 수 있는 공간 생성
		// []는 타입뒤에, 변수뒤에 써도 상관없음
		// 타입 뒤가 더 낫다
		
		int[] arr1; // arr4배열이 저장하는 값의 타입은 int
		double[] arr2; // arr2배열이 저장하는 값의 타입은 double
		String[] arr3; // arr3배열이 저장하는 값의 타입은 String
		
		int [] arr4;	
		arr4 = new int[5]; // int 값 5개 저장할 공간 생성 // 배열 선언후 배열을 할당한 것
		
		arr4[0] = 10;	// index 활용해서 값 저장
		arr4[1] = 11;
		arr4[2] = 99;
		arr4[3] = 100;
		arr4[4] = 200;
//		arr4[5] = 300; // 5번 인덱스는 없음 // 없는 인덱스값을 선언하면 프로그램이 종료된다
		
		System.out.println(arr4[0]);
		System.out.println(arr4[1]);
		System.out.println(arr4[2]);
		System.out.println(arr4[3]);
		System.out.println(arr4[4]);
		
		int a = arr4[4]; // int a에 arr 값 할당한 것
		System.out.println(a);
		
	}
}

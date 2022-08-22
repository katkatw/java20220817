package ch04.lecture;

public class C10For연습 {
	public static void main(String[] args) {
		
		//0~01234////////////////////////////////////////////
		
		System.out.println("===============================");
		System.out.println("-------------------------------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		//1~1234/////////////////////////////////////////////
		
		System.out.println("-------------------------------");
		for (int i = 0; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		//0~12~345~6789/////// 1이 안나옴 // 오답 ///////////
		
		System.out.println("-------------------------------");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(i + (j+i));
			}
			System.out.println();
		}
		
		
		//0~12~345~6789///// 정답 ///////////////////////
		
		System.out.println("-------------------------------");
		int k = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(k);
				k++;
			}
			System.out.println();
		}
		
		
		//* ~ *****//////////////////////////////////////////
		
		System.out.println("-------------------------------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		// ***** ~ */////////////////////////////////////////
		
		System.out.println("-------------------------------");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < (5-i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		// 정답1 /////////////////////////////////////////////
		System.out.println("-------------------------------");
		for (int i = 0; i < 5; i++) {
			// space 출력
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			
			// * 출력
			for (int l = 5; l > i; l--) {
				System.out.print("*");
			}
			
			System.out.println();
		}		
		
		
		// 정답2 /////////////////////////////////////////////
		System.out.println("-------------------------------");
		for (int i = 0; i < 5; i++) {
			// space 출력
			for (int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			
			// * 출력
			for (int l = 0; l <= i; l++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		// 오답1 /////////////////////////////////////////////
		System.out.println("-------------------------------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < (5-i); j++) {
				System.out.print(" ");
			}
			for (int j2 = 0; j2 < (5-i); j2++) {
				System.out.print("*");
				}
			System.out.println();
		}
		
		
		// 오답2 /////////////////////////////////////////////
		System.out.println("-------------------------------");
		for (int i = 0; i < 5; i++) {
			//space 출력
			for (int j = 0; j < (5-i); j++) {
				System.out.print(" ");
			}
			// * 출력
			for (int l = 0; l <= i; l++) {
				System.out.print("*");
				}
			System.out.println();
		}
		

		// 연습중 /////////////////////////////////////////////
		
		System.out.println("-------------------------------");
		int l = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((l++) % 10);
			}
			System.out.println();
		}
	}
}

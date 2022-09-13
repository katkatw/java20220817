package ch13.lecture.p01generic;

import java.util.ArrayList;

public class C03ArrayList {
	public static void main(String[] args) {
		ArrayList arr1 = new ArrayList();
		arr1.add(3); // 넣는건 add
		
//		arr1.get(0); // get의 0번 인덱스의 값을 꺼낸다
//		int v1 = arr1.get(0); // 이건 안됨 강제형변환 필요
//		int v1 = (int) arr1.get(0); // 값 꺼내기 // get메소드는 object.. int 불가능 반대는 가능
		// 따라서 위험한 코드
		Object o1 = arr1.get(0);
		if (o1 instanceof Integer) {
			int v1 = (Integer) o1;	// 이렇게 써야
			System.out.println(v1);
		}
		
		
	}
}

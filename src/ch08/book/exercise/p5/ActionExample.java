package ch08.book.exercise.p5;

public class ActionExample {
	public static void main(String[] args) {
		Action action = new Action() {

			@Override
			public void work() {
				System.out.println("복사를 합니다.");
				
			}
			
		};
				
		action.work();
	}
}

//public class ActionExample {
//	public static void main(String[] args) {		 // 클래스 없이 바로하는 법
//		Action action = new Action() {				 // 원래는 안되는데, new Action();은 안되지만 세미콜론전에 {}몸통을 붙이면 할 수 있다.
//													 // 대신 클래스처럼 {}안에 interface내의 메소드를 오버라이딩해주면 됨
//			@Override								 // void 어쩌구() {      } // void = public void 어쩌구
//			public void work() {
//				System.out.println("복사를 합니다.");
//				
//			}
//			
//		};
//				
//		action.work();
//	}
//}

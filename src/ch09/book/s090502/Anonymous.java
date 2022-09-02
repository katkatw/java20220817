package ch09.book.s090502;

public class Anonymous {
	// 필드 초기값으로 대입
	RemoteControl field = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	};
	
	void method1() {
		// 로컬 변수값으로 대입
		RemoteControl localVar = new RemoteControl() { // 인터페이스 구현과 생성을 한번에 + 재정의
			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다.");
			}
			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다.");
			}	
		};
		// 로컬 변수 사용
		localVar.turnOn();	// 재정의한 메소드 호출
	}
	
	void method2(RemoteControl rc) { // 리모트컨트롤 타입의 파라미터를 받는 메소드2
		rc.turnOn();
	}
}

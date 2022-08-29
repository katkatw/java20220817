package ch06.book.s0609;

public class Car {
	// 필드
	String model;
	int speed;
	
	// 생성자
	Car(String model) {
		this.model = model;
	}
	
	// 메소드
	void setSpeed(int speed) {
		this.speed = speed; // 필드에서 메소드에 접근하기도 OK
	}
	
	void run() {
		for (int i = 10; i <= 50; i+= 10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다.(시속:" + this.speed + "km/h)");
			
		}
	}
}

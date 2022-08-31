package ch07.book.exercise.p07;

public class SnowTireExample {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		
		snowTire.run(); // snowTire참조변수를 run으로 호출
		tire.run();		// Tire참조변수를 run으로 호출
	}
}

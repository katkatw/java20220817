package ch08.book.s080503;

import ch08.book.s080502.Tire;
import ch08.book.s080502.HankookTire;

public class Car {
	Tire[] tires = {
		new HankookTire(),
		new HankookTire(),
		new HankookTire(),
		new HankookTire()
	};
	
	void run() {
		for (Tire tire : tires) {
			tire.roll();	
		}
	}
}

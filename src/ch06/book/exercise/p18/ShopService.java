package ch06.book.exercise.p18;

public class ShopService {
	//
	private static ShopService shopservice = new ShopService();
	
	private ShopService() {} // 생성자를 접근하지 못하도록 하는 것
	
	static ShopService getInstance() {
		return shopservice;
	}
}

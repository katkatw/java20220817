package ch10.book.s100204;

public class ClassCastExceptionExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	}
	
	public static void changeDog(Animal animal) {
//		if (animal instance of Dog) {
			Dog dog = (Dog) animal;		// ClassCastException 발생 가능
//		}
	}
}

class Animal {} // 얘네 다 앱스트랙트 아니니 안에 채울 수 있음
class Dog extends Animal {}
class Cat extends Animal {}

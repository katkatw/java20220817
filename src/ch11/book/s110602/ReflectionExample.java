package ch11.book.s110602;

import java.lang.reflect.Constructor;

public class ReflectionExample {
	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("sec06.exam01_class.Car");
		
		System.out.println("[클래스 이름]");
		System.out.println(clazz.getName());
		System.out.println();
		
		System.out.println("[생성자 정보]");
		Constructor[] constructors = clazz.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			System.out.println(constructor.getName() + "(");
			Class[] parameters = constructor.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
	}
}
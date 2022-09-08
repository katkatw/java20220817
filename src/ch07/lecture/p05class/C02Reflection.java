package ch07.lecture.p05class;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;

public class C02Reflection {
	public static void main(String[] args) {
		Class c = String.class; // c인스턴스는 String에 관련된 필드 메소드 생성자의 정보를 다 알고 있다
		
		Field[] fields = c.getFields(); // 
		
		for (Field field : fields) {
			System.out.println(field.getName());
		}
		
		System.out.println("메소드 목록");
		Method[] methods = c.getMethods();
		
		for (Method method : methods) {
			System.out.println(method.getName());
		}
		
		System.out.println("생성자 목록");
		Constructor[] constructors = c.getConstructors();
		
		for (Constructor constructor : constructors) {
			System.out.println(constructor.getName());
		}
	}
}

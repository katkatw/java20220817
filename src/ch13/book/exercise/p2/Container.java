package ch13.book.exercise.p2;

public class Container<T> {
	private T object;
	
	public void set(T object) {
		this.object = object;
		
	}
	public T get() {
		return object;
	}
}

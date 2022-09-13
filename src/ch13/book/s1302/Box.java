package ch13.book.s1302;

//public class Box { 
//	private Object object;
//	
//	public void set(Object object) { 
//		this.object = object; 
//	}
//	
//	public Object get() { 
//		return object; 
//	}
//}

public class Box<T> { // T라고 하는 파라미터는 나중에 결정되는 것
	private T object;
	
	public void set(T object) { 
		this.object = object; 
	}
	
	public T get() { 
		return object; 
	}
}

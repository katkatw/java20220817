package ch12.lecture;

import java.util.concurrent.atomic.AtomicInteger;

public class C09ThreadSafe {
	public static void main(String[] args) throws Exception {
		AtomicInteger val = new AtomicInteger(0);
		
		Thread t1 = new Thread(() -> {
			for (int j = 0; j < 1000000; j++) {
				val.incrementAndGet();
			}
		});
		
		Thread t2 = new Thread(() -> {
			for (int j = 0; j < 1000000; j++) {
				val.incrementAndGet();
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(val.get());
	}
}

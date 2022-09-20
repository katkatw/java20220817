package ch16.lecture.p02stream;

import java.util.stream.IntStream;

public class C10Parallel {
	public static void main(String[] args) {
		long start = System.currentTimeMillis(); // 현재시간 구하는 메소드
		double avg1 = IntStream.range(1, Integer.MAX_VALUE)
			.filter((n) -> n % 2 == 0) // 짝수만 나오게
			.average()				   // 평균값
			.getAsDouble();
		long end = System.currentTimeMillis();
		
		System.out.println(avg1);
		System.out.println("순차스트림 걸린시간:" + (end - start) + "ms");
		
		start = System.currentTimeMillis();
		double avg2 = IntStream.range(1, Integer.MAX_VALUE)
				.parallel()					// 병렬 스트링
				.filter((n) -> n % 2 == 0) 
				.average()				   
				.getAsDouble();
		end = System.currentTimeMillis();
			
		System.out.println(avg2);
		System.out.println("병렬스트림 걸린시간:" + (end - start) + "ms");
		
		// 병렬 스트림이 더 빠르다?
	}
}

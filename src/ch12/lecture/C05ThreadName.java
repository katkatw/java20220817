package ch12.lecture;

public class C05ThreadName {	// setPriority는 먼저 출력될 확률을 높여줄 뿐 무조건 우선은 아니다
	public static void main(String[] args) {
		Thread t1 = new Task5();
		t1.setName("문자출력 쓰레드");
		t1.setPriority(10); // 가장 높은 우선순위
		t1.start();
		
		Thread t2 = new Task5(); // t1과 t2가 거의 동시에 실행됨
		t2.setName("소리출력 쓰레드");
		t2.setPriority(1); // 가장 낮은 우선순위
		t2.start();
	}
}

class Task5 extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 100000; i++) {
			System.out.println(getName() + ":" + i); // 윈도우 프리퍼런스 콘솔 리밋아웃풋 체크해제
			// 그냥 System.out.println(i)였으면 t1과 t2 구분이 안되는데 따라서 getName() 활용!
			// 출력도 자원이 하나라서 번갈아가며 일어난다.
		}
	}
}
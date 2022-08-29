package ch06.book.exercise.p17;

import ch06.book.exercise.p16.Printer;

public class PrinterExample {
	public static void main(String[] args) {
		Printer printer = new Printer();
		printer.println(10); // printer에 있는 println 메소드라는걸 알 수 있음
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
	}
}

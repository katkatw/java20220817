package ch02.book;

import java.util.Iterator;

public class GarbageValueExample {
	public static void main(String[] args) {
		byte var1 = 125;
		int var2 = 125;
		for (int i = 0; i < 5; i++) {
			var1++;
			var2++;
			System.out.println("var1: " + var1 + "\t" + "var2: " + var2);	// \t는 tab만큼 칸을 띄워줌
		}
	}
}

package ch05.book;

public class StringEqualExample {
	public static void main(String[] args) {
		String strVar1 = "신민철"; // 신민철이 들어간게 아니라 신민철이란 콘텐트가 들어간 인스턴트 참조값
		String strVar2 = "신민철";
		
		if(strVar1 == strVar2) {
			System.out.println("starVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("starVar1과 strVar2는 참조가 다름");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("starVar1과 strVar2는 문자열이 같음");
		}
		
		String strVar3 = new String("신민철"); // new + 생성자 String("")
		String strVar4 = new String("신민철");
		
		if(strVar3 == strVar4) {
			System.out.println("starVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("starVar3과 strVar4는 참조가 다름");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("starVar3과 strVar4는 문자열이 같음");
		}
	}
}

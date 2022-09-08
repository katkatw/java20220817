package ch06.lecture.p11annotation;

public class C02Element {
	@MyAnnotation2(value = "coyote")
	private int i;
	
	@MyAnnotation2(value = "iceman")
	private int j;
	
	@MyAnnotation2("iceman") // value = 생략 가능
	private int k;
	
	@MyAnnotation2
	private int l;
	
	@MyAnnotation2(value = "iceman", age = 30) // 여러 어노테이션 값은 value = 를 생략하지 못함
	private int m;
	
	@MyAnnotation2(week = week.TUESDAY)
	pravate int o;
	
	@MyAnnotation2(names = {"maverick", "phoenix"})
	private int p;
	
	@MyAnnotation2(names = {"rooster"})
	private int q;
	
	@MyAnnotation2(names = "rooster")
	private int r;
}

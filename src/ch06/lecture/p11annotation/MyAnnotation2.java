package ch06.lecture.p11annotation;

import ch05.lecture.p04enum.Week;

public @interface MyAnnotation2 {
	String value() default ""; // () 붙여야함 // element (attribute) // 마이어노테이션은 value라는 엘레멘트를 받은 것 
	int age() default 0;	// 모든 것에 디폴트 값이 들어갔으므로 C02Element 오류 안남
	Week week() default Week.MONDAY;
	
	String[] names() default {};
}

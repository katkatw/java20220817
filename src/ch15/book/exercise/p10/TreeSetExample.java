package ch15.book.exercise.p10;

import java.util.TreeSet;

public class TreeSetExample {// "중요"
	public static void main(String[] args) {			  
		TreeSet<Student> treeSet = new TreeSet<Student>(); // ()안에 컴페어레이터를 안썼으니까 // 아래 Student클래스에 컴페어레이블을 implement 한다
		Student s1 = new Student("blue", 96);
		Student s2 = new Student("red", 96);
		treeSet.add(s1);
		treeSet.add(new Student("hong", 86));
		treeSet.add(new Student("white", 92));
		treeSet.add(s2);
		
		System.out.println(treeSet.size()); // red가 추가됐나 보기위해서 size를 찾아봄
		System.out.println(s1.equals(s2));
		
		Student student = treeSet.last();
		System.out.println("최고점수: " + student.score);
		System.out.println("최고점수를 받은 아이디: " + student.id);
	}
}

class Student implements Comparable<Student> {
	public String id;
	public int score;

	Student(String id, int score) {
		this.id = id;
		this.score = score;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + score;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (score != other.score)
			return false;
		return true;
	}

	@Override
	public int compareTo(Student o) {
		return this.score - o.score;
	}
}

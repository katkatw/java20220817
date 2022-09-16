package ch15.lecture.p04sortedSet;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class C02SortedSet {
	public static void main(String[] args) {
		SortedSet<Integer> set = new TreeSet<>();
		
		set.add(300);
		set.add(100);
		set.add(99);
		set.add(10000);
		set.add(-1);
		
		System.out.println(set);
		
		System.out.println(set.first());
		System.out.println(set.last());
		
		System.out.println(set.headSet(100));
		System.out.println(set.headSet(500));

		NavigableSet<Integer> nset = (NavigableSet<Integer>) set;
		
		System.out.println(nset.lower(99)); // 99보다 낮은
		System.out.println(nset.floor(99)); // 99 포함
		System.out.println(nset.higher(100));
		System.out.println(nset.ceiling(100)); 
		
	}
}

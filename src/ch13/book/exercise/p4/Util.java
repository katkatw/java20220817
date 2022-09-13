package ch13.book.exercise.p4;

public class Util {
//					 		(Pair<? extends K, ? extends V>) 이렇게도 가능
	public static <K, V> V getValue(Pair<K, V> pair, K key) {
		
		if (pair.getKey().equals(key)) {
			return pair.getValue();
		}
		return null;
	}

}

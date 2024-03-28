package ch13;

import javafx.util.Pair;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public class Util {
		// how1
		public static <K, V> V getValue(Pair<K, V> p, K k) {
		 if(p.getKey() == k) {
		 return p.getValue();
		 } else {
		 return null;
		 }
		}
		// how2
		/*
		 * public static <P extends Pair<K, V>, K, V> V getValue(P p, K k) {
		 * if(p.getKey() = = k) { return p.getValue(); } else { return null; } }
		 */
	}
}

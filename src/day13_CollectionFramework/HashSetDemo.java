package day13_CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	/*
	 * HashSet class implements Set Interface it does not allows duplicates it will
	 * not follow the insertion order hashing mechanishm CRUD
	 */
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("abc");
		hs.add("cde");
		hs.add("abc");
		hs.add("123");
		hs.add("$%^$&");
		hs.add("gty");
		System.out.println(hs);
		// for -each (enhanced for)
		/*
		 * for(int i=0;i<hs.size();i++) { System.out.println(hs.get(i)); }
		 */
		// easiest way
		System.out.println("Using for each loop");
		for (String a : hs) {
			System.out.println(a);
		}

		// hardest way
		System.out.println("Using Iterator concept");
		Iterator<String> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		hs.remove("123");
		System.out.println(hs);
	}

}

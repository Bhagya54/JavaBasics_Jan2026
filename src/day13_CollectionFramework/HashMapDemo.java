package day13_CollectionFramework;

import java.util.HashMap;
import java.util.Map.Entry;


public class HashMapDemo {
/*
 *1. HashMap class which implements Map interface
 *2. stores values in the form of Key and Value pair
 *3.Hashing mechanism- it does not maintain the insertion order
 *4. we call each item - pair,entry,bucket
 *5.set of entries - entry set
 *6.HashMap does not allow duplicate key but if you have a duplicate key
	then it acts as a updation
 *7.HashMap allows duplicate values	
 */
	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer, String>();
		hm.put(1,"mango");
		hm.put(10,"grapes");
		hm.put(45,"guava");
		hm.put(23,"banana");
		hm.put(67,"apple");
		System.out.println(hm);
		hm.put(10,"pear");
		hm.put(40, "guava");
		hm.putIfAbsent(19,"pomegranate");
		System.out.println(hm);
		System.out.println(hm.get(45));//guava
		System.out.println(hm.get(10));//grapes
		
		System.out.println("Using entry set concept");
		for(Entry<Integer,String> entryValue:hm.entrySet()) {
			System.out.println(entryValue);
		}
		
		System.out.println(hm);
		System.out.println("Entry set: " + hm.entrySet());
		System.out.println("All Keys: " +hm.keySet());
		
		for(Integer key:hm.keySet()) {
			//key is : 45 Value is guava
			System.out.println("Key is : " + key + " ; " + "Value is: " + hm.get(key));
		
		}
		
		System.out.println("All Values: " + hm.values());
		
		System.out.println("Is key 10 present? " + hm.containsKey(12));
		
	}

}

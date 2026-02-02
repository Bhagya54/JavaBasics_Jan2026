package day13_CollectionFramework;

import java.util.ArrayList;

public class ArrayListDemo {
/*
 * ArrayList:
 * is a class which implements List interface
 * To store multiple elements
 * internal working is similar to Array - dynamic size
 * maintains the insertion order
 * duplicate values are allowed
 * CRUD
 * Create - add()
 * Retrieve - get(index)
 * Update - set(index,value)
 * Delete - remove()
 * size()
 * contiguos memory
 */
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(12);
		al.add(23);
		al.add(45);
		al.add(12);
		System.out.println(al);
		
		System.out.println(al.get(2));//45
		
		System.out.println("Size of the array list: " + al.size());

		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		al.set(2, 50);
		System.out.println("Updated Value: " +al.get(2));
		
		System.out.println(al);
		al.remove(3);
		System.out.println(al);
		
		System.out.println(al.indexOf(23));	
		
		System.out.println("Using enhanced for loop");
		for (Integer a : al) {
			System.out.println(a);
		}
	}

}

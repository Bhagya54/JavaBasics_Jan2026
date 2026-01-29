package day13_CollectionFramework;

import java.util.LinkedList;

public class LinkedListDemo {
//token based - node - who is before me and after me
	public static void main(String[] args) {
		LinkedList<Integer> al = new LinkedList<Integer>();
		al.add(12);
		al.add(23);
		al.add(45);
		al.add(12);
		
		al.remove(2);
		System.out.println(al.get(2));//12
	}

}

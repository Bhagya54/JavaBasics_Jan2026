package day13_CollectionFramework;

import java.util.ArrayList;

public class ArrayListDemo2 {
	
public static void main(String[] args) 
{
	ArrayList<Integer> al1 = new ArrayList<>();
	al1.add(12);
	al1.add(23);
	//[12,23]
	
	ArrayList<Integer> al2 = new ArrayList<>();
	al2.add(45);
	al2.add(50);
	al2.add(100);
	//[45,50,100]
	
	
	//O/p : [12,23,45,50,100] -- for(0,al1.size()) -al1 -- result.add(al1.get(0))
	
	ArrayList<Integer> result = new ArrayList<Integer>();
	System.out.println(result);
	
	for(int i=0;i<al1.size();i++) {
		result.add(al1.get(i));//0 - [12,23]
	}
	
	for(int j=0;j<al2.size();j++) {
		result.add(al2.get(j));
	}
	
	System.out.println(result);
	
	
	
	
}

}

package day13_CollectionFramework;

import java.util.HashMap;

public class InterviewQuestion {

	public static void main(String[] args) {
		String s1 = "hellloe";
		//get the frequency of each character
		HashMap<Character,Integer> hm = new HashMap<Character, Integer>();
		
		for(int i=0;i<s1.length();i++) {//i=6
			Character c=s1.charAt(i);//e
			if(hm.containsKey(c)) {
				Integer val=hm.get(c) + 1;//1+1
				hm.put(c, val);
			}
			else {
				hm.put(c,1);
			}
		}
		

	for(Character k:hm.keySet())	{
		System.out.println("Key: " + k + " value is: " + hm.get(k));
	}
	}

}

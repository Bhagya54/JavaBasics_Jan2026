package day10_Arrays;

public class ArraysDemo2 {

	public static void main(String[] args) {
		String[] names = {"rina","tina","kishore"};
		//declaration+initialization - 0/1/2
		System.out.println("Names:");
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		
		char[] grades = new char[3];//declaration+instantiation
		grades[0]='1';
		grades[1]='2';
		grades[2]='1';
		//System.out.println(grades[2]);
		System.out.println("Grades");
		for(int i=0;i<grades.length;i++) {
			System.out.println(grades[i]);
		}
	}

}

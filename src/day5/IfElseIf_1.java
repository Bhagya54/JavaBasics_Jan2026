package day5;

public class IfElseIf_1 {
/*
 * marks >=75 -- Distinction
 * marks < 75 and marks>=60 -- First class
 * marks < 60 and marks>=50 -- Second class
 * marks < 50 and marks>=40 -- Third class
 * marks<40 -- fail
 * 
 * 
 */
	public static void main(String[] args) {
		int marks = 56;
		
		
		if(marks >=75) {
			System.out.println("Distinction");
		}
		
		else if(marks < 75 && marks>=60) {
			System.out.println("First class");
		}
		
		else if(marks < 60 && marks>=50) {
			System.out.println("Second class");
		}
		else if(marks < 50 && marks>=40) {
			System.out.println("Third class");
		}
		else if(marks < 40) {
			System.out.println("Fail");
		}

	}

}

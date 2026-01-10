package day5;

public class IfElse_2 {
	/*
	 *
	 * y salary > 100 - "Credit card can be taken"
	 * 	 salary <=100 - "Credit card cannot be taken"
	 * 1. if - else
	 * 2. if - elseif - else - Nested if else statement
	 * 3. switch
	 * 
	 */

	public static void main(String[] args) {
		int salary = 400;
		if(salary>100) {
			System.out.println( "Credit card can be taken");
		}
		else {
			System.out.println("Credit card cannot be taken");
		}

	}
}



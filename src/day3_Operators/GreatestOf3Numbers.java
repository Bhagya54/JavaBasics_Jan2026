package day3_Operators;

public class GreatestOf3Numbers {

	public static void main(String[] args) {
		int a=120;
		int b=23;
		int c=110;
		
		String result = (a > b && a > c) ? "a is greatest" : 
			(b > c ? "b is the greatest" : "c is the greatest");
		System.out.println(result);

	}

}

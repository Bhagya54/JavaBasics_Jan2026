package day3_Operators;

public class BinaryOperator {
	
	

	public static void main(String[] args) {
		/*
		 * Relational - <,>,<=,>=,== -- boolean
		 * Logical - &&,||,!
		 *    Condition 1 && Condition 2 - &&
		 *    c1 - true and c2 - true > true
		 *    c1 - false and c2 - true > false
		 *    c1 - true and c2 - false > false
		 *    c1 - false and c2 - false > false
		 *    
		 *    
		 *    OR - ||
		 *    c1 - true and c2 - true > true
		 *    c1 - false and c2 - true > true
		 *    c1 - true and c2 - false > true
		 *    c1 - false and c2 - false > false
		 *    
		 *    NOT - !
		 *    c1 - true !c1 > false
		 *    c1 - false !c1 > true
		 *    
		 * Arithmetic - +,-,/,*,%
		 * Assignment - =
		 * 
		 * 
		 * 
		 */
		System.out.println("Arithmetic Operator");
		int a=100;
		int b=20;
		System.out.println(a+b);//120
		System.out.println(a-b);//80
		System.out.println(a*b);//2000
		System.out.println(a/b);//5
		System.out.println(a%b);//0
		
		
		System.out.println(a>b);//true
		System.out.println(a==b);//false

		
		int c=12;
		
		System.out.println(a>b && a>c);//true
		
		System.out.println(a>b && c>b);//true && false >> false
		System.out.println(a>b || c>b);//true || false >> true
		
		System.out.println(!(a>b));//false
	}

}

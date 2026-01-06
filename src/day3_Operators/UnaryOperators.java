package day3_Operators;

public class UnaryOperators {

	public static void main(String[] args) {
		/*
		 * pre increment : ++a - a+1
		 * post increment : a++ -
		 * pre decrement : --a
		 * post decrement: a--
		 */

		int a=12;
		System.out.println(a);//12
		//System.out.println(++a);//+1 > print value -13 
		System.out.println(a++);//print a value > +1
		System.out.println(a);
		
		int b=13;
		System.out.println(b);
		System.out.println(--b);//-1 > print b
		/*
		 * System.out.println(b--);//print a value > -1 System.out.println(b);//12
		 */	
		
		 int x=23;
	     int y=30;
	     System.out.println(x++ + ++y + ++x);
	     
	     //78
	     /* 
	      * x++ -- 23 >24
	      * 31
	      * 25
	      * 
	      */
	
	}
	
     

}


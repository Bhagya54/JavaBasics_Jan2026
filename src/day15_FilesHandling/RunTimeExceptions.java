package day15_FilesHandling;

public class RunTimeExceptions {
/*
 * java.lang.ArithmeticException: / by zero
 * java.lang.ArrayIndexOutOfBoundsException
 * java.lang.NullPointerException
 * java.lang.NumberFormatException
 */
	public static void main(String[] args) {
		
		String g1 = "hjhjfdhs";
		int g12=Integer.parseInt(g1);
		System.out.println(g12);
		
		String s1 = null;
		System.out.println(s1.length());
		
		int[] s = new int[3];
		s[0]=12;
		s[1]=34;
		s[2]=13;
		
		System.out.println(s[5]);
		
		int a=10/0;
		System.out.println(a);
	}

}

package day2_datatypeconversion;

public class DataTypeConversion {
/*
 * B1:3L container
 * B2:5L container: 2L water
 * 
 * Task 1: B1>B2 - possible
 * Task 2: B2>B1 - confirmation-chances of data loss
 */
	
	public static void main(String[] args) {
		byte b1=10;
		int i1=b1;
		System.out.println(b1);//10
		System.out.println(i1);//10

		int i2=20;
		byte b2=(byte) i2;
		System.out.println(i2);
		System.out.println(b2);
		
		int i3=56;
		float f1=i3;
		System.out.println(i3);//56
		System.out.println(f1);//56.0
		
		float f2=23.76f;
		int i4=(int) f2;
		System.out.println(f2);//23.76
		System.out.println(i4);//23
		
		char c1='s';
		int i5=c1;
		System.out.println(c1);//s
		System.out.println(i5);//115
		
		int i6=65;
		char c2=(char) i6;
		System.out.println(i6);//65
		System.out.println(c2);//A
		
		String s1="123.34";
		double i7=Double.parseDouble(s1);
		System.out.println(s1);
		System.out.println(i7+"45");
		
		
		long i8=45647467;
		String s2 = Long.toString(i8);
		System.out.println(i8);//45647467
		System.out.println(s2);//45647467
		
	}

}

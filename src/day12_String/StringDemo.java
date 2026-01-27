package day12_String;

public class StringDemo 
{

	
	public static void main(String[] args) {
		/*
		 * String - is a class for storing sequence of character
		 * non-primitive datatype
		 * immutable - cannot change the value
		 * 2 ways
		 * 1. Literal
		 * 2. new keyword
		 * == in case STring - compare 2 references are they
		 * pointing to same object or not
		 * equalsIgnoreCase () - compare values of String variables
		 */
		String s1="Java";
		String s2="Python";
		String s3="java";
		System.out.println(s1==s2);//false
		System.out.println(s1==s3);//false
		
		System.out.println(s1.equals(s3));//false
		
		String sn1=new String("Coffee");
		String sn2=new String("Tea");
		String sn3=new String("Coffee");
		System.out.println(sn1==sn2);//false
		System.out.println(sn1==sn3);//false
		
		String str = "Hello";
		str=str.concat(" World");
		System.out.println(str);//Hello
		
		String str1 = "Selenium with Java";
		System.out.println(str1.charAt(2));//l
		System.out.println(str1.contains("with"));//true
		System.out.println(str1.endsWith("Java"));
		System.out.println(str1.startsWith("fdgfg"));
		System.out.println(str1.replace('i', '2'));
		System.out.println(str1.indexOf('i'));//5
		//isEmpty - ""
		//isBlank - " "
		String si="";
		String si1="    ";
		System.out.println(si.isEmpty());
		System.out.println(si1.isBlank());
		
		System.out.println(str1.length());//18
		
		//reverse the String: "selenium" //7 - lenght-8
		String original= "selenium";
		int lenghtOfStr=original.length();
		String reverse="";
		for(int i=lenghtOfStr-1;i>=0;i--) {//i=0
			reverse = reverse+original.charAt(i);//"muineles"
		}
		System.out.println("Reverse of the string: " + reverse);
		
		
		
		//StringBuffer - mutable
		StringBuffer sb = new StringBuffer("hello");
		sb.append(" world");
		System.out.println(sb);//hello world
		
		System.out.println(sb.reverse());
		
	}

}

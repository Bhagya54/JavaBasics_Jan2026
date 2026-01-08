package day4;
/*
 * 
 * Juicer - apple + water -- juice
 *  coconut + water - pachadi
 * 
 */
public class MethodsDemo {
	
	public static int sum(int a,int b) {
		int c=a+b;
		return c;
	}

	public static float sum(float f1,float f2) {
		float f3 = f1+f2;
		return f3;
	}
	
	public static void helloWorld() {
		System.out.println("Hello World");
		
	}
	
	public static void main(String[] args) {
		int sumOfIntegerValue=sum(23, 34);
		System.out.println(sumOfIntegerValue);
		
		float sumOfFloatValue=sum(23.56f,45.2f);
		System.out.println(sumOfFloatValue);
		
		helloWorld();

	}

}

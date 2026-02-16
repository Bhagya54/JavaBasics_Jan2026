package day14_OOPs_Inheritance_Polymorphism;

public class MethodOverloadingDemo {

	public void sum(int a,int b) {
		System.out.println("Sum of 2 integer: " + (a+b));
	}
	
	public void sum(double a,double b) {
		System.out.println("Sum of 2 double values: " + (a+b));
	}
	
	public void sum(int a,int b,int c) {
		System.out.println("Sum of 3 integer values: " + (a+b+c));
	}
	
	public static void main(String[] args) {
		MethodOverloadingDemo mo = new MethodOverloadingDemo();
		mo.sum(2,3);
		mo.sum(12.34,23.6);
		mo.sum(34,12,4);

	}

}

package day9_constructors;

public class ConstructorDemo {
	int num;//12
	String name;
	
	
	/*Constructor: used to initialize values to the variables
	 * same name as that of a class name
	 * Types:
	 * non-parameterized
	 * parameterized
	 * 
	 * this keyword:
	 * used when current class variables name and parameter name are same
	 */
	public ConstructorDemo() {
		System.out.println("Non Parameterized Constructor");
	}

	public ConstructorDemo(int num1) {
		num=num1;
		
	}
	
	public ConstructorDemo(String name1) {
		name=name1;
		//System.out.println("Parameterized Constructor: " +name);
	}
	
	
	public static void main(String[] args) {
    ConstructorDemo cd1 = new ConstructorDemo(12);
    
    ConstructorDemo cd3 = new ConstructorDemo();
    
    ConstructorDemo cd2 = new ConstructorDemo("selenium");
    System.out.println(cd1.num);
    System.out.println("Parameterized Constructor: " +cd2.name);
	}

}

package day8_TypesofMethodsAndVariables;

public class Student {
	/*Types of Variables
	 * 1.Local : variable access is within the method
	 * 2.Global:variables which are outside the method and 
	 * can be accessed by all methods
	 * 		>static - common across all object.You don't need object creation for accessing
	 * 		static variable
	 * 		className.variable
	 * 		>instance - can be accessed through object creation
	 *
	 * 
	 * Types of Methods:
	 * 	1.Instance - can be accessed through object creation
	 *  2.Static - You don't need object creation for accessing
	 * 		static methods
	 * 		className.methodName()
	 * 
	 */
	public String name;//instance variable
	public int id;
	public String pancard;
	public char grade;
	public char section;
	public static String schoolName;//static variable
	
	public void a() {
		System.out.println(name);
		System.out.println(schoolName);
		
	}
	
	public void b() {
		//System.out.println(abc);
		System.out.println(id);
	}
	
	public void attendSession() {
		System.out.println("Student attends session");	
	}
	
	public void submitProject() {
		System.out.println("Student submits project");	
	}
	
	public static void getSchoolName() {
		System.out.println(schoolName);
	}
	

}

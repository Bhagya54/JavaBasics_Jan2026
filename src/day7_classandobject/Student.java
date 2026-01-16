package day7_classandobject;

public class Student {

	//properties - variables and behavior - methods
	//name,id,pancard,section,grade
	//attendSession,submitProject
	String name;
	int id;
	String pancard;
	char grade;
	char section;
	
	public void attendSession() {
		System.out.println("Student attends session");	
	}
	
	public void submitProject() {
		System.out.println("Student submits project");	
	}
	
	public static void main(String[] args) {
		Student s1=new Student();// object creation -instantiation- s1(object)
		s1.name="ram";
		s1.id=123;
		s1.grade='1';
		s1.section='A';
		s1.pancard="asdf2345g";
		System.out.println(s1.name);
		s1.attendSession();
		s1.submitProject();
		
		Student s2=new Student();// object creation - s2(object)
		s2.name="tina";
		s2.id=345;
		s2.grade='2';
		s2.section='B';
		s2.pancard="tyetywq12213";
		System.out.println(s2.name);
		s2.attendSession();
		s2.submitProject();
	}
	
}

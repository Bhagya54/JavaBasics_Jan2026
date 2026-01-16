package day8_TypesofMethodsAndVariables;

public class MainClass {
	static int a=10; 
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.id=123;
		s1.name="riyaz";
		s1.grade='1';
		s1.attendSession();
		s1.a();
		s1.b();
		Student.getSchoolName();
		Student.schoolName="kairos";
		System.out.println(s1.id);
		System.out.println(Student.schoolName);
		
		Student s2 = new Student();
		s2.id=456;
		s2.name="kaira";
		s2.grade='2';
		
		System.out.println(s2.id);
		System.out.println(Student.schoolName);
		

	}
}

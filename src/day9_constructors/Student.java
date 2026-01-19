package day9_constructors;

public class Student {
	int rollNo;
	String name;

	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	public static void main(String[] args) {
		Student s1 = new Student(12,"arun");
//		s1.rollNo=56;
//		s1.name="kaira";
		System.out.println("Id of Student 1: " + s1.rollNo);
		System.out.println("name of Student 1: " + s1.name);

		Student s2 = new Student(56, "Saira");
		System.out.println("Id of Student 2: " + s2.rollNo);
		System.out.println("name of Student 2: " + s2.name);

	}

}

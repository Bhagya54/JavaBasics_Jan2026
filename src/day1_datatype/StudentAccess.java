package day1_datatype;

import day8_TypesofMethodsAndVariables.Student;

public class StudentAccess {

	public static void main(String[] args) {
		Student st1 = new Student();
		st1.name="Sara";
		Student.schoolName="abc";
		st1.attendSession();
		Student.getSchoolName();

	}

}

package day14_OOPs;

public class MainClass {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.attendSession();
		s1.submitsProject();
		s1.marksAttendance();
		s1.lunchTime();
		
		Staff st1 = new Staff();
		st1.calculateAttendance();
		st1.processSalary();
		st1.marksAttendance();
		st1.lunchTime();
		
		Teacher t1 = new Teacher();
		t1.conductSession();
		t1.evaluateProject();
		t1.marksAttendance();
		t1.lunchTime();
	}

}

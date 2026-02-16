package OOPs_Encapsulation;

public class Library {

	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.getId());//read permission
		s1.setName("abc");
		System.out.println(s1.getName() + "has secured first in the college");
		s1.setGender('m');
		System.out.println("Gender is: " + s1.getGender());

	}

}

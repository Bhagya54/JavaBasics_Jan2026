package OOPs_Encapsulation;

public class Student {

	private int id=12;
	private String name;
	private char grade;
	private char section;
	private char gender;
	/*
	 * read - getValue - getter method
	 * write - setValue - setter method
	 */
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		if(gender=='m'||gender=='f') {
			this.gender = gender;
		}
		else {
			System.out.println("Gender cannot be this value");
		}
		
	}
	
	
}

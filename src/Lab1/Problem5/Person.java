package Lab1.Problem5;

public class Person {
	private String name;
	private Gender gender;
	
	public Person(String name, Gender gender) {
		this.name = name;
		this.gender = gender;
	}
	
	public Gender getGender() {
		return gender;
	}
	
	public String toString() {
		return name + " (" + gender + ")";
	}
}

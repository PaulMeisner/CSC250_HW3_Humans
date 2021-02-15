public class attributes
{
	private int age;
	private String firstName;
	private String lastName;
	private String gender;
	
	public attributes(String firstName, String lastName, int age, String gender)
	{
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}
	
	void display()
	{
		System.out.println("First name: " + this.firstName + "\nLast Name: " + this.lastName + "\nAge: " + this.age + "\nGender: " + this.gender);
	}
}
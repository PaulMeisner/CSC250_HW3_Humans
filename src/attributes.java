public class attributes
{
	private String name;
	private String heroName;
	private String identity;
	private String align;
	private String gender;
	
	public attributes(String name, String heroName, String identity, String align, String gender)
	{
	
		this.name = name;
		this.heroName = heroName;
		this.identity = identity;
		this.align = align;
		this.gender = gender;
	}
	
	void display()
	{
		System.out.println("Name: " + this.name + "\nHero Name: " + this.heroName + "\nIdentity: " + this.identity + "\nAlign: " + this.align + "\nGender: " + this.gender);
	}
}
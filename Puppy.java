public class Puppy
{
	int puppyAge;
	String puppyName;
	
	public Puppy(String name, int age)				// constructor
	{
		puppyName = name;
		puppyAge = age;
	}

	public void setAge(int age)
	{
		puppyAge = age;
	}

	public String getName()
	{
		return puppyName;
	}

	public int getAge()
	{
		return puppyAge;
	}

	public static void main(String[] args)
	{
		Puppy myPuppy = new Puppy("tommy", 3);
		System.out.println("Puppy's name is: " + myPuppy.getName());
		System.out.println("age is :" + myPuppy.puppyAge);
		myPuppy.setAge(2);
		int x = myPuppy.getAge();
		System.out.println("after change now age is :" + x);
	}
}
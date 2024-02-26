// public class Person {
//     private String name;
//     private int age;
//     private String interest;

//     public void bio()
//     {
//         System.out.println(name + " is " + age + " years old.  They like " + interest );
//     }

//     public void Greeting()
//     {
//         System.out.println("Hi! I'm " + name);
//     }   

//     public void setName(String aName){
//        name = aName;
//     }
// }

class Person
{
	private String name;
	private int age;
	private String gender;
	private String interest;
	
	/**Default Constructor**/
	public Person(){
		this.interest = "Forth Coming";
	}
	
	/**Constructor with Parameters**/
	public Person(String interest, String Gender, int Age, String Name)
	{
		this.interest = interest;
		gender = Gender;
		age = Age;
		name = Name;
	}

	/**Another overloaded constructor with Parameters**/
	public Person(String interest, String Name)
	{
		this.interest = interest;
		gender = gender;
		age = age;
		name = Name;
	}

	public String toString() //Overriding the base class toString() method
	{
	   return name + " the end time for "+ interest + " has arrived!";
	}
}


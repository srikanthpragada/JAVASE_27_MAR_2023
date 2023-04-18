package lib1;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return  this.name + " : " + this.age;
	}
	
	@Override 
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
		 Person other = (Person)  obj;
		 return this.name.equals(other.name) && 
				   this.age == other.age;
		}
		else
			return false; 
	}
	
	@Override 
	public int hashCode() {
		return this.age;
	}
	
}

public class TestPerson {

	public static void main(String[] args) {
		Person p1 = new Person("Bill", 50);
		Person p2 = new Person("Bill", 50);
		
		System.out.println(p1.toString());
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		System.out.println(p1.equals(p2));
		
		System.out.println(p1.equals("Abc"));

	}

}

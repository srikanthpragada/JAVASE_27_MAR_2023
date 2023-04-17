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
		 Person other = (Person)  obj;
		 return this.name.equals(other.name) && 
				   this.age == other.age;
	}
	
}

public class TestPerson {

	public static void main(String[] args) {
		Person p1 = new Person("Bill", 50);
		Person p2 = new Person("Bill", 60);
		
		System.out.println(p1.toString());
		System.out.println(p1.equals(p2));
		 

	}

}

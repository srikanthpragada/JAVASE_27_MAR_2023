package oop1;

class Student {
	private int admno;
	private String name;
	private int course, feepaid;
	
	public Student(int no, String n) {
		admno = no;
		name = n;
		course = 1; // default is 1 
	}
	public Student(int no, String n, int c) {
		admno = no;
		name = n;
		course = c;
	}
	
	public Student(int no, String n, int c, int fp) {
		admno = no;
		name = n;
		course = c;
		feepaid = fp;
	}
	 
	public void payment(int amount) {
		feepaid += amount;
	}

	public int getTotalFee() {
		return course == 1 ? 10000 : 20000;
	}

	public int getDue() {
		 return getTotalFee() - feepaid;
	}
	
	public String getCourseName() {
		return course == 1 ? "Java" : "Java EE";
	}
}

public class TestStudent {
	public static void main(String[] args) {
		 Student s = new Student(1, "James", 2);
		 s.payment(5000);
		 System.out.println(s.getDue());
		 System.out.println(s.getCourseName());
		 
	}

}

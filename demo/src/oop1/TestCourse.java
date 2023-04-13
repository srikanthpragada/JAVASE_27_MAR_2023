package oop1;

class Course {
	private String title;
	private int fee;
	public Course(String title, int fee) {
		this.title = title;
		this.fee = fee;
	}
	public int getFee() {
		return this.fee;
	}
}

class OnlineCourse extends Course {
	private String link;
	public OnlineCourse(String title, int fee, String link) {
		super(title, fee);
		this.link = link;
	}
	@Override
	public int getFee() {
		return super.getFee() * 110 / 100;
	}
	public String getLink() {
		return this.link;
	}
}

public class TestCourse {

	public static void main(String[] args) {
		 Course c = new Course("Java SE", 10000);
		 // upcasting 
		 // c = new OnlineCourse("Python", 10000, "http://xyz");
		 
		 // Downcasting
		 if(c instanceof OnlineCourse) {
		     OnlineCourse oc = (OnlineCourse) c;
		 }
		  
		 // Pattern matching - check and downcast 
		 if(c instanceof OnlineCourse online) {
		      System.out.println(online.getFee());
		 }
		 
		 
	}

}


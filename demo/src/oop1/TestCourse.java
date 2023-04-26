package oop1;

class InvalidFeeException extends RuntimeException {
	public InvalidFeeException() {
		super("Invalid Course Fee");
	}
}

class Course {
	private String title;
	private int fee;

	public Course(String title, int fee) throws InvalidFeeException{
		this.title = title;
		if (fee < 0)
			throw new InvalidFeeException();
		this.fee = fee;
	}

	public final String getTitle() {
		return this.title;
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
		System.out.println(c.getFee()); // Runtime Polymorphism

		c = new OnlineCourse("Python", 10000, "http://xyz");
		System.out.println(c.getFee()); // Runtime Polymorphism

	}

}

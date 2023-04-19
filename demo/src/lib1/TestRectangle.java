package lib1;

record Rect(int length, int width) {
	int area() {
		return length * width;
	}
}

public class TestRectangle {

	public static void main(String[] args) {
		var r1 = new Rect(10, 20);
		System.out.println(r1.toString());
		System.out.println(r1.length());
		System.out.println(r1.area());
		

	}

}

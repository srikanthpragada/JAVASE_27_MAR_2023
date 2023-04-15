package lib1;

public class StringDemo {

	public static void main(String[] args) {
		String s = "Java is awesome";
		
		System.out.println(s.indexOf("is"));
		System.out.println(String.join(" - ", "java", "C#", "Python"));
		System.out.println("Java\nPython".indent(10));
	}
}

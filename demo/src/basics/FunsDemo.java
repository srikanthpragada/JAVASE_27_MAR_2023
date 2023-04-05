package basics;


public class FunsDemo {

	public static void print(String msg) {
		System.out.println(msg);
	}

	public static void printAll(String ... messages) {
		for(String s : messages)
			System.out.println(s);
	}
	
	public static void main(String[] args) {
		print("Hello");
		printAll("Hi", "Hello", "Good Morning");
	}

}

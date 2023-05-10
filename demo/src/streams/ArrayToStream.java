package streams;

import java.util.Arrays;
import java.util.function.Consumer;

class PrintName implements Consumer<String> {
	@Override
	public void accept(String t) {
		System.out.println(t.toUpperCase());
	}
}

public class ArrayToStream {

	public static void main(String[] args) {
		String[] names = { "TypeScript","Visual Basic","Java", 
				           "JavaScript", "Php", "Python","C#" };
		
		Arrays.stream(names)  // convert array to stream 
		      .filter(n ->  n.length() > 5)  // Predicate : boolean test(Object)
		      .sorted()
		      .forEach(System.out::println); // Consumer : void accept(Object)
		      

	} 

}

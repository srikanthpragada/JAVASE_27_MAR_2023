package lambda;

import java.util.Arrays;

public class SortLongNames {

	public static void main(String[] args) {
		 String [] names = {"Li","Joe","Andy","Scott",
				 "Richards","Jason","James","Kim"};
		 
		 Arrays.stream(names)
		       .filter( v -> v.length() > 3)
		       .sorted()
		       .limit(3)
		       .forEach(System.out::println);
		       //.forEach( v -> System.out.println(v));

		 
	}

}

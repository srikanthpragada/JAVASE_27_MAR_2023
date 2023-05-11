package streams;

import java.nio.file.Files;
import java.nio.file.Path;

public class PrintMoreThanAvg {

	public static void main(String[] args) throws Exception {

		Path p = Path.of("d:\\classroom\\mar27j\\marks.txt");
	 
		// Find out avg marks
		var avgMarks = 
		   	 Files.lines(p)
		   	  .mapToInt(v -> Integer.parseInt(v))  // Covert String to int
		      .average()       // OptionalDouble 
		      .getAsDouble();
		
		// Display marks > avg marks 
		
		Files.lines(p)
		 .mapToInt(v -> Integer.parseInt(v))  
		 .filter( v -> v > avgMarks)
		 .forEach(System.out::println);
		    
	}

}

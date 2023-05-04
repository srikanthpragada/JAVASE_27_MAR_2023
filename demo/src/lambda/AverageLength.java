package lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AverageLength {

	public static void main(String[] args) throws IOException {
		 
		var lines = Files.lines(Paths.get("d:\\classroom\\jan22\\names.txt"));
		
		var avg = lines.filter(v -> v.trim().length() > 0 )
				       .mapToInt(v ->  v.length())
		               .average();
		
		System.out.println(avg.getAsDouble());
		
		lines = Files.lines(Paths.get("d:\\classroom\\jan22\\names.txt"));
		lines.distinct().sorted().forEach(System.out::println);
	}

}

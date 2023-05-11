package streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.function.Consumer;
 
public class SortNamesFromFile {
	public static void main(String[] args) throws IOException {
	     var p = Path.of("d:\\classroom\\mar27j\\names.txt");
	     
	     var names = Files.lines(p); // get a stream 
	     
	     names.distinct()  // unique values
	          .sorted()
	          .forEach(System.out::println);
	} 

}

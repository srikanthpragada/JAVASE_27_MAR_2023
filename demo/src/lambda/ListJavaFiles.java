package lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ListJavaFiles {

	public static void main(String[] args) throws IOException {
		Files.walk(Paths.get("d:\\classroom\\jan22"))
		     .filter( p -> p.toString().endsWith(".java"))
		     .forEach(System.out::println);
	}

}

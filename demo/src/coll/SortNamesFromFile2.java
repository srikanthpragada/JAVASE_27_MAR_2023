package coll;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;

public class SortNamesFromFile2 {
	public static void main(String[] args) throws IOException {
		
		    var path = Path.of("d:\\classroom\\mar27j\\names.txt");
		    var names = Files.readAllLines(path);
		    
			Collections.sort(names); // names.sort(null);
			
			for(String name : names)
				System.out.println(name);
	}

}

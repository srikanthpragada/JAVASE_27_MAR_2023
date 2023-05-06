package coll;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeSet;

public class SortNamesFromFile3 {

	public static void main(String[] args) throws IOException {
		
		    var path = Path.of("d:\\classroom\\mar27j\\names.txt");
		    var names = Files.readAllLines(path);
		    var uniqueNames = new TreeSet<String>(names);
	    

			
			for(String name : uniqueNames)
				System.out.println(name);
	}

}

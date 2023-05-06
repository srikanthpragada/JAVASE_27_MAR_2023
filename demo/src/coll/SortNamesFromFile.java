package coll;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class SortNamesFromFile {

	public static void main(String[] args) throws IOException {
		try (FileReader fr = new FileReader("d:\\classroom\\mar27j\\names.txt")) {
			var br  = new BufferedReader(fr);
			var names = new ArrayList<String>();
						
			while(true) {
				String name = br.readLine();
				if (name == null)
					break;
				
				names.add(name);
			}
			br.close();
			
			Collections.sort(names); // names.sort(null);
			
			for(String name : names)
				System.out.println(name);

		}
	}

}

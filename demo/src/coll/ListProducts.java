package coll;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeMap;

public class ListProducts {

	public static void main(String[] args) throws IOException {
		var p = Path.of("d:\\classroom\\mar27j\\products.txt");
		var lines = Files.readAllLines(p);
		
		var products = new TreeMap<Integer, String>();
		
		for(var line : lines) {
			var parts = line.split(",");
			products.put( Integer.parseInt(parts[0]), parts[1]);
		}
		
		for(var id : products.keySet())
			System.out.printf("%5d  %-20s\n", id, products.get(id));

	}

}

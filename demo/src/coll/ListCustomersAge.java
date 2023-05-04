package coll;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.TreeMap;

public class ListCustomersAge {

	public static void main(String[] args) throws IOException {
		var lines = Files.readAllLines(Path.of("d:\\classroom\\jan22\\customers.txt"));
		var customers = new TreeMap<String, LocalDate>();
		var sysdate = LocalDate.now();
		for (String line : lines) {
			var parts = line.split(",");
			if (parts.length < 2)
				continue;
			try {
				var dob = LocalDate.parse(parts[1]);
				customers.put(parts[0], dob);
			} catch (Exception ex) {
			}
		}

		for (String name : customers.keySet()) {
			var years = ChronoUnit.YEARS.between(customers.get(name), sysdate);
			System.out.printf("%-20s  %d\n", name, years);
		}

	}

}

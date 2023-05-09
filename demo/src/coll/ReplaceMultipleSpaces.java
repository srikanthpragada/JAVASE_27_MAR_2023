package coll;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Pattern;

public class ReplaceMultipleSpaces {
	public static void main(String[] args) throws IOException {
		Path p = Path.of("d:\\classroom\\mar27j\\test.txt");
		var contents = Files.readString(p);
		
		Pattern pattern = Pattern.compile(" +");
		var matcher = pattern.matcher(contents);
		
		var newContents = matcher.replaceAll(" ");
		//System.out.println(newContents);
		
		Files.writeString(p,newContents);
		
	}

}

package lib2;

import java.nio.file.Files;
import java.nio.file.Path;

public class PathDemo {

	public static void main(String[] args) {
		 Path p = Path.of("d:\\classroom\\mar27");
		 System.out.println(p.getClass());
		 
		 System.out.println(Files.exists(p));
	}

}

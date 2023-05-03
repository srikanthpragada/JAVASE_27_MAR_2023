package lib2;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		 var f = new File("d:\\classroom\\mar27j");
		 
		 System.out.println(f.exists());
		 System.out.println(f.isFile());
	}

}


package lib2;

import java.io.BufferedReader;
import java.io.FileReader;

public class ShowNamesStartWithB {

	public static void main(String[] args) throws Exception {
		var fr = new FileReader("d:\\classroom\\mar27j\\names.txt");
		var br = new BufferedReader(fr);
		
		while(true) {
			var name = br.readLine();
			if(name == null) // EOF
				break; 
			
			if(name.startsWith("B"))
				System.out.println(name);
		}
	    br.close();
		fr.close();
	}
}

package lib2;

import java.io.FileReader;
import java.io.LineNumberReader;

public class ShowNamesStartWithBV2 {

	public static void main(String[] args) throws Exception {
		var fr = new FileReader("d:\\classroom\\mar27j\\names.txt");
		var lnr = new LineNumberReader(fr);
		
		while(true) {
			var name = lnr.readLine();
			if(name == null) // EOF
				break; 
			
			if(name.startsWith("B"))
				System.out.printf("%2d: %s\n", lnr.getLineNumber(), name);
		}
	    lnr.close();
		fr.close();
	}
}

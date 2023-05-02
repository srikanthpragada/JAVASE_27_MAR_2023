package lib2;

import java.io.FileReader;

public class CountCharTypes {

	public static void main(String[] args) throws Exception {
		var fr = new FileReader("d:\\classroom\\mar27j\\names.txt");
		int ch, upper = 0, lower = 0, other = 0;
		
		while (true) {
			ch = fr.read();
			if (ch == -1) // EOF
				break;
			
			if(Character.isUpperCase(ch))
				 upper++;
			else
				if(Character.isLowerCase(ch))
					 lower ++;
				else
					 other ++;
		}
		fr.close();
		System.out.printf("Upper = %d, Lower = %d, Others = %d\n", upper, lower, other);
	}
}

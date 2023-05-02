package lib2;

import java.io.FileWriter;
import java.util.Scanner;

public class WriteEmails {

	public static void main(String[] args) throws Exception {

		// try with resources - ARM
		try (var fw = new FileWriter("d:\\classroom\\mar27j\\emails.txt", true)) {
			Scanner s = new Scanner(System.in);

			while (true) {
				System.out.print("Enter email [end to stop] :");
				var email = s.nextLine();
				if (email.equals("end"))
					break;

				fw.write(email + "\n");
			}
		}
	}
}

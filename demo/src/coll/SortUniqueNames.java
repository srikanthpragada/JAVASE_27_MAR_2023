package coll;

import java.util.Scanner;
import java.util.TreeSet;

public class SortUniqueNames {

	public static void main(String[] args) {
		 var names = new TreeSet<String>();
		 var scanner = new Scanner(System.in);
	 
		 while(true) {
			 System.out.println("Enter name [end to stop] :");
			 String name = scanner.nextLine();
			 if (name.equals("end"))
				 break;
			
			 names.add(name);
		 }
		 
		 for(String name : names)
			 System.out.println(name);
		 
		 scanner.close();

	}

}

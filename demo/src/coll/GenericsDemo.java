package coll;

import java.util.ArrayList;

public class GenericsDemo {

	public static void main(String[] args) {
		var al = new ArrayList<String>();
		var al2 = new ArrayList<Integer>();
		
		al2.add(10);
		
		// al.add(10);
		al.add("Abc");

		String s = al.get(0);

	}

}

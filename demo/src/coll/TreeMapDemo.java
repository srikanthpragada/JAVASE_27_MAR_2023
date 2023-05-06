package coll;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		var students = new TreeMap<Integer, String>();
		
		students.put(1,  "Abc");
		students.put(5,  "Xyz");
		students.put(3,  "Abc");
		students.put(2,  "Pqr");
		
		
		for(var k : students.keySet())
			System.out.println(k + ":" + students.get(k));
		

	}

}

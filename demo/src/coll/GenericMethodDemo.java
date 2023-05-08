package coll;

public class GenericMethodDemo {

//	public static void print(String[] values) {
//
//	}
//
//	public static void print(int[] values) {
//
//	}

	public static <T> void print(T[] values) {
          for(var v : values)
        	  System.out.println(v);
	}

	public static void main(String[] args) {
		var names = new String[10];
		var marks = new Integer[10];

		print(names);
		print(marks);

	}

}

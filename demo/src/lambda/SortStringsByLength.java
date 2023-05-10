package lambda;

import java.util.Arrays;
import java.util.Comparator;

class LengthCompare implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		 return s1.length() - s2.length();
	}
}

public class SortStringsByLength {

	public static void main(String[] args) {
		
		var names = new String[] 
				    {"SQL", "Java", "JavaScript","Python","C"};
		
		//Arrays.sort(names, new LengthCompare());
		
		// Lambda Expression 
		Arrays.sort(names, (s1, s2) ->  s1.length() - s2.length());
		
		for(var n : names)
			System.out.println(n);

	}

}

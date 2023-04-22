package oop2;

import java.util.Arrays;

class Point implements Comparable<Point> {
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return x + "," + y;
	}
	@Override
	public int compareTo(Point other) {
		 if (this.y > other.y)
			 return 1;
		 else
			 if (this.y < other.y)
				 return -1;
			 else
				 return this.x - other.x;
	}
}

public class SortPoints {

	public static void main(String[] args) {
		Point points[] = { new Point(10, 20), new Point(1, 2), new Point(5, 6) };

		Arrays.sort(points);

		for (var p : points)
			System.out.println(p);

	}

}

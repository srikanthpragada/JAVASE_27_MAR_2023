package coll;

import java.util.TreeSet;

class Point implements Comparable<Point> {
	private int x,y;
	public Point(int x, int y) {
		this.x  = x;
		this.y  = y;
	}
	@Override
	public String toString() {
		return "x=" + x + ", y=" + y;
	}
	@Override
	public int hashCode() {
		return x * y;
	}
	@Override
	public boolean equals(Object obj) {
		Point other = (Point) obj;
		return this.x == other.x && this.y == other.y;
	}
	@Override
	public int compareTo(Point other) {
	    return  (this.x * this.y) - (other.x * other.y);
	}
}

public class TestHashSet {

	public static void main(String[] args) {
		 var points = new TreeSet<Point>();
		 
		 points.add( new Point(1,2));
		 points.add( new Point(10,20));
		 points.add( new Point(11,12));
		 points.add( new Point(10,10));
		 
		 for(Point p : points)
			 System.out.println(p);
		 

	}

}

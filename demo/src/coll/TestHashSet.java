package coll;

import java.util.TreeSet;

class Circle implements Comparable<Circle> {
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public String toString() {
		return String.valueOf(this.radius);
	}

	@Override
	public int hashCode() {
		return this.radius;
	}

	@Override
	public boolean equals(Object obj) {
		Circle other = (Circle) obj;
		return this.radius == other.radius;
	}

	@Override
	public int compareTo(Circle other) {
		return this.radius - other.radius;
	}
}

public class TestHashSet {

	public static void main(String[] args) {
		var list = new TreeSet<Circle>();

		list.add(new Circle(10));
		list.add(new Circle(20));
		list.add(new Circle(10));
		list.add(new Circle(5));

		for (var c : list) {
			//System.out.println(c.hashCode());
			System.out.println(c);
		}

	}

}

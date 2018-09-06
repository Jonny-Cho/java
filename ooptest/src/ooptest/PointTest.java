package ooptest;

class Point {
	int x;
	int y;

	public String toString() {
		return "x : " + x + ", y : " + y;
	}
}

public class PointTest {

	public static void main(String[] args) {
		Point p = new Point();
		p.x = 3;
		p.y = 5;
		System.out.println("p.x=" + p.x);
		System.out.println("p.y=" + p.y);
		System.out.println(p.toString());
	}

}

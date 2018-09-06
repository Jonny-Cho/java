package ooptest;

class Point {
	int x;
	int y;

	public String toString() {
		return "x : " + x + ", y : " + y;
	}
	
	Point(){
		x = 1; // x는 인스턴스 변수
		y = 1;
	}; // 기본생성자
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}; // 매개변수 있는 생성자
	
	double getDistance(int x1){
		double result = Math.sqrt((x1-x)*(x1-x));
		return result;
	}
	
	double getDistance(int x1, int y1){
		double result = Math.sqrt((x1-x)*(x1-x)+(y1-y)*(y1-y));
		return result;
	}
	
}

public class PointTest {
	public static void main(String[] args) {
		Point p2 = new Point(); // 기본생성자 이용
		Point p = new Point(2,2); // 매개변수생성자 이용
		System.out.println("p.x=" + p.x);
		System.out.println("p.y=" + p.y);
		System.out.println(p2.toString()); //기본생성자 호출
		System.out.println(p.toString()); //매개변수생성자 호출
		System.out.println(p.getDistance(3)); //(2)와(3)사이 길이 계산
		System.out.println(p.getDistance(3,3)); //(2,2)와(3,3)사이 길이 계산
	}
}

package chapter07;

class Point {
	int x;
	int y;

	Point() {
		this(0, 0);
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "[" + x + "," + y + "]";
	}
}

abstract class Shape {
	Point p;

	Shape() {
		this(new Point(0, 0));
	}

	Shape(Point p) {
		this.p = p;
	}

	abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드

	Point getPosition() {
		return p;
	}

	void setPosition(Point p) {
		this.p = p;
	}
}

class Circle extends Shape {
	double r; // 반지름

	Circle() {}
	
	Circle(Point p){
		super(p);
	} 

	Circle(double r) {
		this.r = r;
	}

	Circle(Point p, double r) {
		super(p);
		this.r = r;
	}

	@Override
	double calcArea() {
		return Math.PI * r * r;
	}
}

class Rectangle extends Shape {
	int width; // 폭
	int height; // 높이

	Rectangle() {}
	
	Rectangle(Point p) {
		super(p);
	}
	
	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	Rectangle(Point p, int width, int height) {
		super(p);
		this.width = width;
		this.height = height;
	}

	@Override
	double calcArea() {
		return width * height;
	}

	boolean isSquare() { // 정사각형인지 아닌지를 알려준다
		return width == height;
	}
}


public class Exam7_22 {

	static double sumArea(Shape[] arr) {
		double sum = 0.0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i].calcArea();
		}
		return sum;
	} 
	
	public static void main(String[] args) {
		Shape[] arr = { new Circle(5.0), new Rectangle(3, 4), new Circle(1) };
		System.out.println("면적의 합:" + sumArea(arr));
	}

}

//면적의 합:93.68140899333463
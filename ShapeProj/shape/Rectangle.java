package shape;

import pos.Point;

public class Rectangle extends Shape {
	int width;
	int height;
	Point point;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	
	public Rectangle(String colorString, Point point, int num1, int num2) {
		super(colorString);
		this.point = point;
		this.width = num1;
		this.height = num2;
	}
	
	public Rectangle(String colorString, int x1, int y1, int num1, int num2) {
		this(colorString, new Point(x1, y1), num1, num2);
	}
	
	public void draw() {
		System.out.println(String.format("[사각형 : 색-%s, 시작점 : %s, 가로 : %d, 세로 : %d]", 
				color, point.toString(), width, height));
	}
}

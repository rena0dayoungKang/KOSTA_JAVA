package shape;

import pos.Point;

public class Triangle extends Shape {

	Point point1;
	Point point2;
	Point point3;
	
	public Triangle() {
		// TODO Auto-generated constructor stub
	}
	
	public Triangle(String colorString, Point point1, Point point2, Point point3) {
		super(colorString);
		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
	}
	
	public Triangle(String colorString, int px1, int py1, int px2, int py2, int px3, int py3) {
		this(colorString, new Point(px1, py1), new Point(px2, py2), new Point(px3, py3));
	}
	
	public void draw() {
		System.out.println(String.format("[삼각형 : 색 - %s, 점1 : %s, 점2 - %s, 점3 - %s]", 
				color, point1.toString(), point2.toString(), point3.toString()));
	}

}

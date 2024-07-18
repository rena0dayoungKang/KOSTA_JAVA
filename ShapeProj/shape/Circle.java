package shape;

import pos.Point;

public class Circle extends Shape {

	int radius; // 반지름
	Point point; //point클래스와 circle클래스는 포함관계 
	
	public Circle() {} 

	public Circle(String color, Point point, int radiusarg) {
		super(color);
		this.point = point;
		this.radius = radiusarg;
	}

	public Circle(String color, int xarg, int yarg, int radiusarg) {
		this(color, new Point(xarg, yarg), radiusarg);
		//super(color);
		//point = new Point(xarg, yarg);
	}
	
	public void draw() {
		System.out.println(toString().format("[원 : 색-%s, 중심점 : (%d, %d), 반지름 : %d]", color, point.getX(), point.getY(), radius));
	}
	


}

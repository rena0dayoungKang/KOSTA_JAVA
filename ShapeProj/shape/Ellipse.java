package shape;

import pos.Point;

public class Ellipse extends Shape {

	Point point1;
	Point point2;
	int distanceTotal;
	
	public Ellipse(String colorString, Point point1, Point point2, int distTotarg) {
		super(colorString);
		this.point1 = point1;
		this.point2 = point2;
		this.distanceTotal = distTotarg;
	}
	
	public Ellipse(String colorString, int x1, int y1, int x2, int y2, int distTotarg) {
		this(colorString, new Point(x1,y1), new Point(x2, y2), distTotarg);
	}
	
	@Override
	public void draw() {
		System.out.println(String.format("[타원 : 색 - %s, 점1 : %s, 점2 : %s, 거리합 : %d]", 
				color, point1, point2, distanceTotal));
	}

}



import pos.Point;
import shape.Circle;
import shape.Rectangle;
import shape.Triangle;
import shape.Ellipse;

public class ShapeMain {

	public static void main(String[] args) {
		
		ShapeSet ss = new ShapeSet();
		ss.addShape(new Circle("빨강", new Point(10, 20), 5));
		ss.addShape(new Circle("주황", 35, 24, 5));
		ss.addShape(new Rectangle("파랑", new Point(3, 5), 20, 10));
		ss.addShape(new Rectangle("하늘", 50, 60, 10, 20));
		ss.addShape(new Triangle("초록", new Point(1, 1), new Point(2, 2), new Point(10, 20)));
		ss.addShape(new Triangle("연두", 20, 2, 2, 30, 20, 30));
		ss.addShape(new Ellipse("노랑", new Point(10,10), new Point(20,20), 30)); //색, 점1(x,y), 점2(x,y), 두점에서의 거리의 합 
		ss.addShape(new Ellipse("베이지", 12, 21, 13, 31, 20)); //색, 점1(x,y), 점2(x,y), 두점에서의 거리의 합 
		
		ss.drawAll();
		
		Circle circle1 = new Circle("빨강", new Point(10, 20), 5); // 색, 중심점, 반지름
		Circle circle2 = new Circle("주황", 35, 24, 5); // 색, 중심점x, 중심점y, 반지름

		Rectangle rectangle1 = new Rectangle("파랑", new Point(3, 5), 20, 10); // 색깔, 시작점, 가로, 세로
		Rectangle rectangle2 = new Rectangle("하늘", 50, 60, 10, 20); // 색깔, 중심점x, 중심점y, 가로, 세로

		Triangle triangle1 = new Triangle("초록", new Point(1, 1), new Point(2, 2), new Point(10, 20)); // 색, 점1, 점2, 점3
		Triangle triangle2 = new Triangle("연두", 20, 2, 2, 30, 20, 30); // 색, 점1x, 점1y, 점2x, 점2y, 점3x, 점3y

//		circle1.draw();
//		circle2.draw();
//		rectangle1.draw();
//		rectangle2.draw();
//		triangle1.draw();
//		triangle2.draw();
		//draw()함수를 공통적으로 가지고 있다.!?
		//근데 구현부가 다르다. 오롯이 부모 것을 그대로 쓸 수 없다
		//여러 자식들이 공통적으로 가지고 있는 것을 부모가 가지는데, 
		//이름만 보면 부모에서 draw 하면 좋은데, draw의 결과가 각각 다르다
		//공통 부분이 있는가를 생각해봄 -> 색깔 정도..? 
		//같은 부분이 얼마나 있나 생각해보아야 한다. 

	}

}

//[원 : 색 - 빨강, 중심점 : (10, 20), 반지름 : 5]
//[원 : 색 - 주황, 중심점 : (35, 24), 반지름 : 15]
//[사각형 : 색 - 파랑, 시작점 : (3,5), 가로 : 20, 세로 : 10]
//[사각형 : 색 - 하늘, 시작점 : (50,60), 가로 : 10, 세로 : 20]
//[삼각형 : 색 - 초록, 점1 : (10, 1), 점2 : (1, 20), 점3 : (10, 20)]
//[삼각형 : 색 - 연두, 점1 : (20, 2), 점2 : (2, 30), 점3 : (20, 30)]
//[타원 : 색 - 노랑, 점1 : (10, 10), 점2 : (20, 20), 거리합 : 30]
//[타원 : 색 - 베이지, 점1 : (12, 21), 점2 : (13, 31), 거리합 : 20]


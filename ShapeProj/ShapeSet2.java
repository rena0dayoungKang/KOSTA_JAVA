import shape.Shape;

public class ShapeSet2 {
	
	Shape[] shapes = new Shape[100];
	//shapeset클래스는 static이 아니라서 static안붙음
	//엄마 Shape 배열 100 개를 만들어서 엄마[0]번에 circle넣고 엄마[1]번에 Triangle넣고 이렇게 하고 싶음
	
	int shapeCnt;
	
	public void addShape(Shape shape) {
		shapes [shapeCnt++] = shape;
	}
	
	public void drawAll() {
		for (int i = 0; i < shapeCnt; i++) {
			shapes[i].draw();
			//메롱이 아니고 자식 draw()를 호출하는 것임
			//자식들의 draw()를 각각 호출 하고 싶은데 shape엄마한테는 draw()가 없어
			//그래서 엄마한테 똑같은 이름의 draw() 오버라이딩이 있다면 shapeSet에서 draw()를 
			//호출하면 자식들꺼를 각각 호출하게 되는 것이야
		}
	}
}

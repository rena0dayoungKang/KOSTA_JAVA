import shape.Shape;

public class ShapeSet {
	
	Shape[] shapes = new Shape[100];
	int shapeIdx;
	
	public void addShape(Shape shape) {
		shapes[shapeIdx++] = shape;
	}
	
	public void drawAll() {
		for (int i = 0; i < shapeIdx; i++) {
			shapes[i].draw();
		}
	}
	
	
}

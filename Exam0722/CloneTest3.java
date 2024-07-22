//Object 클래스 내부의 clone()메서드
class Circle implements Cloneable{
	Point center;
	int radius;

	public Circle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}

	public Circle(int x, int y, int radius) {
		center = new Point(x, y);
		this.radius = radius;
	}

	@Override
	public String toString() {
		return String.format("원 [중심점:%s, 반지름 :%d]", center, radius);
	}

	@Override
	public Object clone() {
		try {
			Circle c = (Circle)super.clone();
			c.center = new Point(center.x, center.y);
			//clone메소드에서 수동으로 분리해주는 작업이 필요하다. 
			return c;
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

}

public class CloneTest3 {

	public static void main(String[] args) {
		Circle c1 = new Circle(10, 10, 20);
		Circle c2 = (Circle) (c1.clone());
		
		c1.center.x = 100; 
		c1.radius = 200;
		System.out.println("c1:"+c1);
		System.out.println("c2:"+c2);
//		c1:원 [중심점:(100,10), 반지름 :200]
//		c2:원 [중심점:(100,10), 반지름 :20]
		//c1의 x만 바꾸었지만 c2의 x도 바뀌어버림
		//이렇게 나와버림!!! 그래서 clone의 try블록 내부를 바꿨다
	}

}

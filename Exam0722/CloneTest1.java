class Point implements Cloneable { //clone을 사용하려면 Cloneable를 implements해야한다.
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}

	@Override
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}

	}
}

public class CloneTest1 {

	public static void main(String[] args) {
		Point p1 = new Point(3, 5);
		Point p2 = (Point) (p1.clone()); // protected라서 오버라이딩 해서 public으로 바꾸어 사용해야한다.
		
		p1.x=100;
		System.out.println(p1);
		System.out.println(p2); //공유가 아니라 복제이므로 p2의 x는 안바뀜
		
	}

}

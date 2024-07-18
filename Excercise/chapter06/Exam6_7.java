package chapter06;

class MyPoint {
	static int x;
	static int y;

	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//1)
//	double getDistance(int x, int y) {
//		return Math.sqrt((double) (this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
//	}
	
	//2)
	double getDistance(int x1, int y1) {
		return Math.sqrt((double) (x - x1) * (x - x1) + (y - y1) * (y - y1));
	}
	
}

public class Exam6_7 {

	public static void main(String[] args) {
		MyPoint p = new MyPoint(1, 1);
		
		// p(1,1)과 (2,2)의 거리를 구한다.
		System.out.println(p.getDistance(2,2)); //객체 생성한 다음 호출하는 메서드니까 static아닌 메서드야

	}

}

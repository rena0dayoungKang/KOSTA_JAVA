package chapter06;

public class Exam6_6 {
	// 두 점의 거리를 계산하는 getDistance()를 완성하시오
	// 두 점 (x,y)와 (x1, y1) 간의 거리를 구한다.
	static double getDistance(int x, int y, int x1, int y1) {
		return Math.sqrt((double) (x - x1) * (x - x1) + (y - y1) * (y - y1));
	}

	public static void main(String[] args) {

		System.out.println(getDistance(1, 1, 2, 2));

	}

}

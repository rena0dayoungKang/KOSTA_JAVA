package pos;

public class Point {

	int x;
	int y;
	
	

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Point() {
		// TODO Auto-generated constructor stub
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		// 왜 public접근제어자만 될까? 같은 패키지에 있는데..!?
		// default 접근제어자는 동일 패키지 내에서만 접근 가능
		// 알고보니 package이름이 default여서 같은 폴더로 인식을 안한것?

		return "(" + x + "," + y + ")";
		// 자기가 가진 내용을 문자열로 만들어 준다는 메서드
	}

}

//일반변수와 static변수
class Card {
	String number;
	String shape;
	static int height = 15; // 이렇게 static에서 직접 초기화 하는 방법도 있음.
	static int width = 25;
	// static은 이렇게 변수에만 붙지 않고 메소드에도 붙을 수 있음. ex) static void main

	String draw() {
		return String.format("숫자 : %s, 모양 : %s, 가로 : %d, 세로 : %d", number, shape, width, height);
	}

}

public class VariableTest2 {

	public static void main(String[] args) {
//		Card.width = 15;
//		Card.height = 25;

		Card h1 = new Card();
		h1.number = "A";
		h1.shape = "hart";

		Card h2 = new Card();
		h2.number = "2";
		h2.shape = "hart";

		Card d1 = new Card();
		d1.number = "A";
		d1.shape = "diamond";

		System.out.println(h1.draw());
		System.out.println(h2.draw());
		System.out.println(d1.draw());
		// height, width를 각각 초기화 하지 않아도 객체들끼리 공유한다.

	}

}

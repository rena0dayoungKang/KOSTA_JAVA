package chapter07;

public class SutdaCard {
	int num;
	final boolean isKwang;

	SutdaCard() {
		//this(1, true);  final은 반드시 생성자에서 초기화 해야 하는데 this가 없으면 오류가 난다
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	// info()대신 Object클래스의 toString()을 오버라이딩했다.
	public String toString() {
		return num + (isKwang ? "K" : "");

	}
}

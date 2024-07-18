package chapter07;

public class Exam7_2 {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		System.out.println(deck.pick(0));// 섞기 전 맨앞 카드
		System.out.println(deck.pick());// 섞기 전 랜덤 카드
		deck.shuffle(); // 섞는 메서드 호출

		for (int i = 0; i < deck.cards.length; i++)// 섞고 출력하기
			System.out.print(deck.cards[i] + ",");

		System.out.println();
		System.out.println(deck.pick(0));// 섞고 난 후 첫번째 카드

	}

}

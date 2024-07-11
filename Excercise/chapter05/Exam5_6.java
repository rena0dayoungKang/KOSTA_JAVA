package chapter05;

public class Exam5_6 {

	public static void main(String[] args) {
		// 큰 금액의 동전을 우선적으로 거슬러 줘야한다
		int[] coinUnit = { 500, 100, 50, 10 };

		int money = 2683;
		System.out.println("money=" + money);

		for (int i = 0; i < coinUnit.length; i++) {
			int x, y=0;
			if (money != 0) {				
				x = money / coinUnit[i];
				money %= coinUnit[i];
				System.out.println(money);
			} else {
				break;
			}
			//System.out.println(coinUnit[i]+"원 : " + x);
		}
	}

}

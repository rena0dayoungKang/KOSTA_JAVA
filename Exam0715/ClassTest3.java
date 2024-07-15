class MyMath {
	int val1;
	int val2;

	int add() {
		int score = val1 + val2;
		return score;
	}

	int sub() {
		int score = val1 - val2;
		return score;
	}

	int mul() {
		int score = val1 * val2;
		return score;
	}

	int div() {
		int score = (val1 != 0 && val2 != 0) ? (val1/val2) : 0; 
		//0을 나누기 하면 프로그램이 죽기 때문에 0인 조건과 아닌 조건을 명시한다. 
		return score;
	}

}

public class ClassTest3 {

	public static void main(String[] args) {
		MyMath mm = new MyMath();

		mm.val1 = 0;
		mm.val2 = 100;

		System.out.println(mm.add());
		System.out.println(mm.sub());
		System.out.println(mm.mul());
		System.out.println(mm.div());

	}
}

//25
//15
//100
//4

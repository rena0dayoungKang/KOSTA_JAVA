//for반복문 
public class ForTest1 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i += 2) {
			sum += i; // 1+3+5+7+9
		}
		// System.out.println(sum);

//		for (int dan = 2; dan < 10; dan++) {
//			for (int i = 1; i < 10; i++) {
//				System.out.print(String.format("%dx%d=%2d\t", dan, i, dan * i));
//			}
//			System.out.println();
//		}
		
		
		for (int i=1; i<10;i++) {
			for (int dan=2; dan<10; dan++) {
				System.out.print(String.format("%dx%d=%2d\t", dan, i, dan * i));
			}
			System.out.println();
		}
		//안에 있는 for문이 먼저 바뀌고 밖에 있는 for문이 반복된다는 것을 이해하기 

	}
}


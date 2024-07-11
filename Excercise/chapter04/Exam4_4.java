
package chapter04;

public class Exam4_4 {

	public static void main(String[] args) {
		int sum = 0, i;
//		for (i = 1;; i++) {
////			if (i % 2 == 0) {
////				sum += -i;
////			} else {
////				sum += i;
////			}
//			
//			sum += i%2==0? -i:i;
//			if (sum >= 100)	break;
//		}
		
		for (i=1; sum<=100; i++) {
			if (i % 2 == 0) {
				sum += -i;
			} else {
				sum += i;
			}
			
			System.out.println("i : "+(i-1));
			System.out.println("sum : "+sum);
			
		}
		
//		System.out.println(i);
	}

}

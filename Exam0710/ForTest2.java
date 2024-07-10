
public class ForTest2 {

	public static void main(String[] args) {
		//1+2+3+4+5+...... 누적합이 100이거나 넘을 때의 합의 값과 그때 마지막 더해지는 값 구하기 
		int sum = 0, i = 0;

		//내가쓴답안 
//		for(i=1; i<30; i++) {
//			if (sum <= 100) {
//				sum += i;
//			} else {
//				break;
//			}
//		}
		
		//선생님답안1
//		for (i=1; sum <100; i++) {
//			sum += i;
//		}
//		System.out.println(i-1); //마지막 sum을 구하고 i++이 되버리기때문에 -1해주어야한다.
//		System.out.println(sum);		
		
		
		//선생님답안2
		for (i=1;;i++) { //조건식을 생략하면 무한반복이라는 의미
			sum += i;
			if(sum >= 100) break;
		}
		System.out.println(i); 
		System.out.println(sum);

	}

}

package chapter04;

public class Exam4_5 {

	public static void main(String[] args) {
		
		int i = 0; //for문에서의 초기식은 while문에서 밖에 위치한다. 
		while (i <= 10) {
			int j = 0; 
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}

}

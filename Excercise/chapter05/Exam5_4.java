package chapter05;

public class Exam5_4 {

	public static void main(String[] args) {
		int[][] arr = {
				 { 5, 5, 5, 5, 5},
				 {10,10,10,10,10},
				 {20,20,20,20,20},
				 {30,30,30,30,30}
				 };
		int total = 0;
		float average = 0;
		
		for (int i = 0 ;i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				total += arr[i][j];
			}
			average = total / arr[i].length; //가변배열일때 average는 어케 구해?
		}
		
		//average = total / (arr.length * arr[0].length) ;			
		
		
		 System.out.println("totat="+total);
		 System.out.println("average="+average);
	}

}

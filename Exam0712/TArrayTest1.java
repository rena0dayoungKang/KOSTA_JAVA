
public class TArrayTest1 {

	public static void main(String[] args) {
		
		int[][] arr1;
		arr1 = new int[2][3];
		//arr1 = {{4,5,6},{7,8,9}}; //error
		arr1[0][0] = 4;
		arr1[0][1] = 5;
		arr1[0][2] = 6;
		arr1[1][0] = 7;
		arr1[1][1] = 8;
		arr1[1][2] = 9;
		
		int[][] arr2 = new int[2][2];
		arr2[0][0] = 1;
		arr2[0][1] = 2;
		arr2[1][0] = 3;
		arr2[1][1] = 4;
		
		
		int[][] arr3 = new int[][] {{1,2,3},{4,5,6}};
		//초기화 동시에 할 때 int [][]안에 숫자를 생략해야 한다.
		
		int[][] arr4;
		arr4 = new int[][] {{10,20},{30,40},{50,60}}; //new int를 붙이면 여기서 초기화도 가능하다
		
		
	}

}

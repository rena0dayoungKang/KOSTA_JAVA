package chapter05;

//아래와 같은 파스칼 삼각형을 출력하는 프로그램을 작성하시오. 
//파스칼 삼각형은 첫 번째 줄 첫 번째 행을 1로 초기화한 후 다음 줄부터는 바로 위의 값과 바로 위 왼쪽의 값을 더한 값이 된다.
public class Jungol6 {

	public static void main(String[] args) {
		int[][] numberMatrix = new int[6][6];

//		// 1. 1로 초기화
//		//numberMatrix[0][0] = 0;  //int배열이니까 0으로 초기화 되어 있음. 
//		//numberMatrix[1][0] = 0;
//		numberMatrix[1][1] = 1;
//
//		// 2. 반복문
//		for (int i = 2; i < numberMatrix.length; i++) {
//			for (int j = 1; j < numberMatrix[i].length; j++) {
//				numberMatrix[i][j] = numberMatrix[i - 1][j - 1] + numberMatrix[i - 1][j];
//			}
//		}
//
//		// 3. 출력
//		for (int i = 0; i < numberMatrix.length; i++) {
//			for (int j = 0; j < numberMatrix[i].length; j++) {
//				if (numberMatrix[i][j] == 0) continue;
//				System.out.print(numberMatrix[i][j]+" ");
//			}
//			System.out.println();
//		}
//	}
		int[][] tArr = new int[6][6];
		tArr[0][1] = 1;

		for (int i = 1; i < tArr.length; i++) {
			for (int j = 1; j < tArr[i].length; j++) {
				tArr[i][j] = tArr[i - 1][j - 1] + tArr[i - 1][j];
			}

		}
		
		for (int i = 0; i < tArr.length; i++) {
			for (int j = i; j < tArr[i].length; j++) {
				if (tArr[i][j] == 0)
					continue;
				System.out.print(tArr[i][j] + " ");
			}
			System.out.println();
		}

	}
}

//출력
//1
//1 1
//1 2 1
//1 3 3 1
//1 4 6 4 1
//if로 해서 계속 비교하기 힘드니까
//각각의 행의 첫번째 열을 0으로 넣는 꼼수
//출력할때는 0열을 빼고 출력하기 
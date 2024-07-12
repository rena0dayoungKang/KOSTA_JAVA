import java.util.Scanner;

//5명 학생의 국어 영어 수학 과학 4과목의 점수를 입력 받아서
//각 개인별로 평균이 80 이상이면 "pass" 그렇지 않으면 "fail"을 출력하고
//합격한 사람의 수를 출력하는 프로그램을 작성하시오.

public class TArrayTest8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int success = 0; //합격자 수 
		// 1. 이차원 배열에 입력
		int[][] scoreMatrix = new int[5][4];
		for (int i = 0; i < scoreMatrix.length; i++) {
			String inputLine = sc.nextLine();
			String[] score = inputLine.split(" ");

			for (int j = 0; j < score.length; j++) {
				scoreMatrix[i][j] = Integer.parseInt(score[j]);
			}
		}

		// 2. 평균으로 pass fail + 합격자 수 
		for (int i = 0; i < scoreMatrix.length; i++) {
			int tot = 0;
			for (int j = 0; j < scoreMatrix[i].length; j++) {
				tot += scoreMatrix[i][j];
			}
			if ((double)tot/scoreMatrix[i].length >= 80) {
				System.out.println("pass");
				success++;
			} else {
				System.out.println("fail");
			}
		}
		System.out.println("Successful : " + success);

		// 3. 출력테스트
		for (int i = 0; i < scoreMatrix.length; i++) {
			for (int j = 0; j < scoreMatrix[i].length; j++) {
				System.out.print(String.format("%3d", scoreMatrix[i][j]));
			}
			System.out.println();
		}
	}

}

//입력
//85 67 95 65
//80 95 86 56
//100 98 67 86
//95 76 84 65
//67 86 90 76

//출력
//fail
//fail
//pass
//pass
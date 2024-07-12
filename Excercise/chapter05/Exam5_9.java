package chapter05;

//주어진 배열을 시계방향으로 90도 회전시켜서 출력하는 프로그램을 완성하시오.
//**
//**
//*****
//*****
public class Exam5_9 {

	public static void main(String[] args) {
		char[][] star = { { '*', '*', ' ', ' ', ' ' }, 
						  { '*', '*', ' ', ' ', ' ' }, 
						  { '*', '*', '*', '*', '*' },
						  { '*', '*', '*', '*', '*' } };

		char[][] result = new char[star[0].length][star.length];
		
		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[i].length; j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[i].length; j++) {
				result[j][star.length - i - 1] = star[i][j];
			}
		}
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}

	}

}

//출력
//****
//****
//**
//**
//**

//(0,0) -> (0,3)
//(0,1) -> (1,3)
//(0,2) -> (2,3)
//(0,3) -> (3,3)
//(0,4) -> (4,3)
//0행은 3열이 된다. 
//0열은 0행이 된다 , 1열은 1행이 된다, 2열은 2행이 된다, 3열은 3행이된다. 

//(1,0) -> (0,2)
//(1,1) -> (1,2)
//(1,2) -> (2,2)
//(1,3) -> (3,2)
//(1,4) -> (4,2)
//1행은 2열이 된다. 
//2행은 1열이 된다. 
//3행은 0열이 된다. 

//=========>열 : star.length -i -1
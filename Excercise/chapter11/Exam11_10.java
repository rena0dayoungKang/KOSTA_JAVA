package chapter11;
//다음 예제는 이용해서 빙고판은 1~30사이의 숫자들로 만든 것인데, 숫자들의 

//위치가 잘 섞이지 않는다는 문제가 있다. 이러한 문제가 발생하는 이유와 이 문제를 개선
//하기 위한 방법을 설명하고, 이를 개선한 새로운 코드를 작성하시오.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exam11_10 {

	public static void main(String[] args) {
		//Set set = new HashSet();
		//HashSet을 이용하게 되면 항상 같은 자리에 같은 값만 들어감
		ArrayList<Integer> al = new ArrayList<>(); 
		Set<Integer> set = new HashSet<>();
		
		int[][] board = new int[5][5];
		while(set.size() < 25) {
			int random = (int) (Math.random() * 30) + 1;
			//set.add((int) (Math.random() * 30) + 1);
			boolean save = set.add(random);
			if (save)al.add(random); 
		}
		Iterator<Integer> it = al.iterator();
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = it.next();
				System.out.print((board[i][j] < 10 ? "  " : " ") + board[i][j]);
			}
			System.out.println();
		}

	}

}

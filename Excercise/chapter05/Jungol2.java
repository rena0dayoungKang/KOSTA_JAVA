package chapter05;

import java.util.Scanner;

//영문 대문자를 입력받다가 대문자 이외의 문자가 입력되면 입력을 중단하고
//영문 대문자들에 대하여 1번 이상 입력된 각 문자와 그 문자의 개수를 사전 순으로 출력하는 프로그램을 작성하시오.
public class Jungol2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] cnt = new int[26]; //배열을 초기화 하면 0으로 초기화 되어 있음 사용자가 입력한 글자가 Afkasu
		//A-A를 했을 때 숫자형태가 나오고 이것을 인덱스로 사용한다. 
		while (true) {
			char input = sc.next().charAt(0);
			if (!(input >= 'A' && input <= 'Z')) break;
				cnt[input - 'A']++;
		}

		for (int i = 0; i < cnt.length; i++) {
			if (cnt[i] == 0)
				continue;
			System.out.println(String.format("%c : %d개", (char)(i +'A'),cnt[i]));
		}
	}

}

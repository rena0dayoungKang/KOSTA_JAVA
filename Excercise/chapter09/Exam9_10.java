package chapter09;

import java.io.CharArrayReader;
import java.util.Iterator;

/*  
(1) format메서드를 작성하시오.
1. length의 값이 str의 길이보다 작으면 length만큼만 잘라서 반환한다.
2. 1의 경우가 아니면, length크기의 char배열을 생성하고 공백으로 채운다.
3. 정렬조건(alignment)의 값에 따라 문자열(str)을 복사할 위치를 결정한다.
(System.arraycopy()사용)
4. 2에서 생성한 char배열을 문자열로 만들어서 반환한다.
*/
public class Exam9_10 {

	public static String format(String str, int length, int alignment) {

		// 1.
		if (str.length() > length) {
			return str.substring(length);
		}

		// 2.
		char[] charr = new char[length];
//		if (str.length() < length) {
//			for (int i = 0; i < charr.length; i++) {
//				charr[i] = ' ';
//			}
//			System.arraycopy(str.toCharArray(), 0, charr, alignment, length - str.length());
//		}

		int startIdx = 0;
		switch (alignment) {
		case 0:
			startIdx = 0;
			break;
		case 1:
			startIdx = (length - str.length()) / 2;
			break;
		case 2:
			startIdx = length - str.length();
			break;
		}

		System.arraycopy(str.toCharArray(), 0, charr, startIdx, str.length());

		return new String(charr);
	}

	public static void main(String[] args) {
		String str = "가나다";
		System.out.println(format(str, 7, 0)); // 왼쪽 정렬
		System.out.println(format(str, 7, 1)); // 가운데 정렬
		System.out.println(format(str, 7, 2)); // 오른쪽 정렬

	}

}

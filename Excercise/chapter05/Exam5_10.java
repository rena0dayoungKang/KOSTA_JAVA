package chapter05;

//다음은 알파벳과 숫자를 아래에 주어진 암호표로 암호화하는 프로그램이다.
//(1)에 알맞은 코드를 넣어서 완성하시오.
public class Exam5_10 {

	public static void main(String[] args) {
		char[] abcCode = { '`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '|', '[',
				']', '{', '}', ';', ':', ',', '.', '/' };
		// 0 1 2 3 4 5 6 7 8 9
		char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };
		String src = "abc123";
		String result = "";

		// 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);
			if (ch>='a' && ch <='z') {  //-> abcCode참조
				result += abcCode[ch-'a'];
			} else if (ch>='0' && ch <= '9') {  //-> numCode참조 
				result += numCode[ch-'0'];
			}
			
			/*
			 * (1) 알맞은 코드를 넣어 완성하시오.
			 */
		}
		System.out.println("src:" + src);
		System.out.println("result:" + result);
	}

}

//abc123 
//'a'~'z'
//'a' => abcCode[0]	'a'-'a' = 0
//'b' => abcCode[1]	'b'-'a' = 1
//'c' => abcCode[2]	'c'-'a' = 2
//...
//'t' => abcCode[19]
//'0' ~ '9'
//'1' => numCode[1]	'1'-'0'
//'2' => numCode[2]	'2'-'0'
//'3' => numCode[3] '3'-'0'

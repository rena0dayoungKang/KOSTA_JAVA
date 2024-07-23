package chapter09;

//StringBuilder와 String클래스의 charAt(int i)과 indexOf(int ch)를 사용하라.
public class Exam9_9 {

	public static String delChar(String str, String delString) {

		StringBuilder sb = new StringBuilder(str);
		for (int i = 0; i < delString.length(); i++) {
			//못찾을때까지 계속 반복하려고 while문 사용 
			while (true) {
				int idx = sb.indexOf(delString.charAt(i) + "");
				if (idx < 0) {break;}
				sb.deleteCharAt(idx);
			}
		}
		return sb.toString();
	}
	

	public static void main(String[] args) {
		System.out.println("(1!2@3^4~5)" + " -> " + delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
		System.out.println("(1 2    3 4\t5)" + " -> " + delChar("(1 2    3   4\t5)", " \t"));
	}

}

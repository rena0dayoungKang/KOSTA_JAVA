package chapter09;

public class Exam9_7 {
	//(1) contains메서드를 작성하시오.
	public static boolean contains(String str, String target) {
//		if (str.indexOf(target) < 0) return false;
//		return true;
		return str.indexOf(target) > 0 ? true : false;
		
	}  
	
	
	public static void main(String[] args) {
		System.out.println(contains("12345", "23"));
		System.out.println(contains("12345", "67"));

	}

}

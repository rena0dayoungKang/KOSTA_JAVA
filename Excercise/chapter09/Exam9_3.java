package chapter09;

public class Exam9_3 {

	public static void main(String[] args) {
		String fullPath = "c:\\jdk1.5\\work\\PathSeparateTest.java";
		//  \\는 한개의 \을 의미한다. 
		String path = "";
		String fileName = "";
		
		//(1) 알맞은 코드를 넣어 완성하시오.
		int idx = fullPath.lastIndexOf('\\');
		path = fullPath.substring(0, idx);
		fileName = fullPath.substring(idx+1);
		
		System.out.println("fullPath:" + fullPath);
		System.out.println("path:" + path);
		System.out.println("fileName:" + fileName);

	}

}

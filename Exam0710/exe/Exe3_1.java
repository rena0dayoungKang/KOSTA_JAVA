package exe;

public class Exe3_1 {

	public static void main(String[] args) {
		int x = 2; //3
		int y = 5;
		char c = 'A'; //'A'의 문자코드는 65
		
		//check
		System.out.println(1 + x << 33);
		//32개가 넘어가면 자동으로 -32 보정해준다. 즉 33쉬프트는 1쉬프트인것 
		
		System.out.println(y >= 5 || x < 0 && x >2); // true
		
		System.out.println(y += 10 - x++); //13
		
		System.out.println(x += 2); //5
		
		System.out.println( !('A' <= c && c <= 'Z') ); //false
		
		//check
		System.out.println('C' - c); //67 - 65 = 2
		
		//check
		System.out.println('5' - '0'); //ASCII로도 5차이 
		
		System.out.println(c+1); //66. +1 이 붙으면서 int형이 된다
		
		//check
		System.out.println(++c); //char의 증감연산자는 char형태 
		
		//check
		System.out.println(c++); //
		
		System.out.println(c);  
	}

}

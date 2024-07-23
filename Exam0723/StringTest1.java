//String클래스 
public class StringTest1 {

	public static void main(String[] args) {
//		String str = "";
//		for (int i = 0; i < 10; i++) {
//			str += "A";
//		}
//		System.out.println(str);
//		// A가 10개 붙은 스트링 출력

		String str = new String("hong");
		char[] carr = { 'g', 'i', 'l', 'd', 'o', 'n', 'g' };
		String name = new String(carr);

		System.out.println(str); // 1. 문자열로 string 생성
		System.out.println(name); // 2. 배열로 string생성.
		// 배열carr가 string으로 합쳐질 수 있음

		StringBuffer sb = new StringBuffer("hong gil dong");
		String fullname = new String(sb); // 3. 스트링버퍼로 string생성
		System.out.println("fullname: " + fullname);

		char ch = str.charAt(1);
		System.out.println(ch);

		String fullname2 = str + name;
		// String fullname2 = str.concat(name);
		System.out.println("fullname2 :" + fullname2);

		System.out.println(fullname.contains("tong"));

		String filename = "hello.txt";
		System.out.println(filename.endsWith("txt"));
		System.out.println(filename.startsWith("hello"));

		System.out.println(fullname.equals(fullname2));

		System.out.println(str.equals("HONG"));
		System.out.println(str.equalsIgnoreCase("HONG"));

		System.out.println(str.indexOf('n'));

		System.out.println(fullname.indexOf("dong")); // 있으면 첫번째 매칭되는 인덱스
		System.out.println(fullname.indexOf("tong")); // 없으면 -1

		String str2 = "fsdsdABDFsdABFF";
		System.out.println(str2.indexOf("AB")); // 처음 나오는 AB인덱스
		System.out.println(str2.lastIndexOf("AB")); // 마지막으로 나오는 AB의 인덱스

		System.out.println(str.length());
		System.out.println(fullname.length());

		// System.out.println(str2.replace("AB", "ab")); //replace해도 원본이 바뀌지 않음!
		// string은 Read Only영역에 저장되기 때문이다.
		String str3 = str2.replace("AB", "ab");
		System.out.println(str3);
		System.out.println(str2);

		String str4 = str2.replaceAll("sd", "SD");
		System.out.println(str4);
		String str5 = str2.replaceFirst("sd", "SD");
		System.out.println(str5);

		String animalString = "cat#dog#bear";
		String[] animalList = animalString.split("#");
		for (int i = 0; i < animalList.length; i++) {
			System.out.print(animalList[i]);
		}
		System.out.println();

		String[] animalList2 = animalString.split("#", 2); // 잘라서 나오는 스트링 갯수 제한
		for (int i = 0; i < animalList2.length; i++) {
			System.out.print(animalList[i]);
		}
		System.out.println();
		
		System.out.println(fullname2);
		System.out.println(fullname2.substring(4));
		System.out.println(fullname2.substring(4, 7)); //7인덱스 나 빼고 4~6인덱스 출력
		
		System.out.println(name.toUpperCase());
		String str6 = "STRING";
		System.out.println(str6.toLowerCase());
		
		//백엔드 데이터 가공에 가장 중요 공백제거
		String str7 = "    as df    ";
		System.out.println(str7);
		System.out.println(str7.length());
		
		System.out.println(str7.trim());
		System.out.println(str7.trim().length());
		
		
		//타입을 문자열로 바꿀 때 
		boolean b = true;
		System.out.println(b+"");
		System.out.println(String.valueOf(b)); //클래스명을 붙이는 static메서드 

		int n = 10;
		System.out.println(n+"");
		System.out.println(String.valueOf(n));
		
	}

}

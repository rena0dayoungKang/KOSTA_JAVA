//switch문
public class SwitchTest1 {

	public static void main(String[] args) {
		int kor = 80, eng = 92, math = 100;
		int tot = kor + eng + math;
		double avg = tot / 3.0;
		String grade;
		
		//int res = (int)Math.round(avg*100)/100F;
		System.out.println(Math.round(avg*100)/100.0);
		
		//Math.round() 메서드 
		//매개변수에 double 이 들어가면 long이 반환된다
		//매개변수에 float이 들어가면 int를 반환한다. 
		
//		switch((int)avg/10) {
//			case 10 : 
//				grade = "A+";
//				break;
//			case 9 :
//				grade = "A";
//				break;
//			case 8 : 
//				grade = "B";
//				break;
//			case 7 :
//				grade = "C";
//				break;
//			case 6 :
//				grade = "D";
//				break;
//			default :
//				grade = "F";
//				break;
//		}
		
		switch((int)(avg/10)) {
		//조건식 안의 변수형태 : 정수형, 문자열이 올 수 있다. byte, short, int, long, char, String가능
		case 10:
		//break를 생략하면 밑의 case9와 같이 사용한다. 
		case 9: grade = "A"; break;
		case 8: grade = "B"; break;
		case 7: grade = "C"; break;
		case 6: grade = "D"; break;
		default: grade = "F";
		}
		
		System.out.println(grade);
		
	}

}

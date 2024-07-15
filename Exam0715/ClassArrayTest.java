//객체와 클래스 (배열)
public class ClassArrayTest {

	public static void main(String[] args) {
		Person[] pers = new Person[3]; 
		//ClassTest에 있는 Person객체 사용 할 수 있다. 
		//pers 배열은 객체(Person) 3개가 아니라 주소값 (4바이트짜리) 3개 이므로 
		//배열은 4바이트 짜리 null 이 3개 들어있는 12바이트 용량이다. 
		//Person 객체가 생성된 것이 아님, 레퍼런스 변수 3개(주소값)만 힙에 생성됨. 
		
//		pers[0].age = 20; //에러가 난다. 객체를 생성안하고 바로 집어 넣으면 에러가 남. 
		int cnt = 0;
		pers[cnt] = new Person();
		pers[cnt] = new Person();
		pers[cnt].age = 20;  //에러가 안난다. 
		pers[cnt].height = 178.2;
		pers[cnt].name = "월요일";
		cnt++;
		
		for (int i = 0; i < cnt; i++) {
//			System.out.println(pers[i].info()); //에러가 난다. 왜냐하면 pers[1],pers[2]에 아무것도 없어서
			System.out.println(pers[i].info());
		}
		//배열에 값이 꽉차 있지 않으면 출력할 때 에러가 난다. 그래서 위에 pers[cnt]로 바꿔주고
		//cnt++로 해서 초기화로 채워주었다. 
		
		
		
	}

}

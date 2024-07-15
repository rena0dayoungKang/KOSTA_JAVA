//매개변수
class Data {
	int num;
}
public class ParamTest1 {
	public static void increament(int d) { //read only
		d = 1000;
		System.out.println(d);
	}
	
	public static void increament(Data d) { //read & write
		d.num = 1000;
		System.out.println(d.num);
	} 
	
	
	
	public static void main(String[] args) {
		Data data = new Data();
		data.num = 10;
		increament(data.num); //인자 값으로 10을 넘겼다. 
		//지역변수 d값이 변경되었지만, data.num 인스턴스와는 관계 없다. 
		System.out.println(data.num); //call by value
		System.out.println("------------");
		increament(data); 
		System.out.println(data.num); //call by reference
		
	}
	
	
	

}

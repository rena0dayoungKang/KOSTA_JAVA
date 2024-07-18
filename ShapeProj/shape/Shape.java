package shape;

public class Shape {
	String color;
	
	public Shape() {
		color = "흰색";
	}
	
	Shape(String colorarg){
		this.color = colorarg;
	} 
	
	public void draw() {
		System.out.println("메");
		
	}
	//shape가 엄마야
	//circle이 애기야
	//draw메서드 오버라이딩 ㅣ 같은 이름의 메서드를 자식에서 재 정의를 했다. 
	
	
	
	

}

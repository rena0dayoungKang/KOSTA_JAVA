//추상메서드와 추상클래스

abstract class Player {
	int currentPos;
	Player() {}
	void play() {
		play(currentPos); //오버로딩 : 하나의 클래스 안에 파라미터가 다르고 메소드 이름이 같다 
		//abstract메소드를 호출한다면? 
	}
	
	abstract void play(int pos);
	abstract void stop();
	
}

class MyPlayer extends Player {

	@Override
	void play(int pos) {
		System.out.println("MyPlayer play(int pos) 호출");
		
	}

	@Override
	void stop() {
		System.out.println("MyPlayer stop() 호출");
	}
	
}
public class AbstractTest {

	public static void main(String[] args) {
		//Player player = new Player(); //abstract 클래스는 객체 생성 불가능
		MyPlayer myPlayer = new MyPlayer();
		myPlayer.play(); //부모꺼 실행해도 자식에서 구현된 play메서드 호출
		//미완성 메서드가 호출되는 시점은 자식이 완성된 시점에서 불러와진다. 
		//abstract메서드는 다 오버라이딩 해주어야 한다. ㅏ
	}

}

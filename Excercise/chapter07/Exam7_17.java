package chapter07;

class Unit { // 공통된 부분을 부모 클래스로 묶어서 뺀다
	int x, y; // 현재 위치

	void move(int x, int y) {
		/* 지정된 위치로 이동 */
		this.x = x;
		this.y = y;
	}

	void stop() {
		System.out.println("현재 위치에 정지");
	}
}

class Marine extends Unit { // 보병
//	int x, y; // 현재 위치

//	void move(int x, int y) {
//		/* 지정된 위치로 이동 */
//	}

//	void stop() {
//		/* 현재 위치에 정지 */
//	}

	@Override
	void move(int x, int y) {
		super.move(x, y);
		System.out.println(String.format("(%d, %d)로 걸어서 이동", x, y));
	}
	
	
	void stimPack() {
		/* 스팀팩을 사용한다. */
		System.out.println("스팀팩을 사용한다.");
	}
}

class Tank extends Unit { // 탱크
//	int x, y; // 현재 위치

//	void move(int x, int y) {
//		/* 지정된 위치로 이동 */
//	}

//	void stop() {
//		/* 현재 위치에 정지 */
//	}

	@Override
	void move(int x, int y) {
		super.move(x, y);
		System.out.println(String.format("(%d, %d)로 굴러서 이동", x, y));
	}

	void changeMode() {
		/* 공격모드를 변환한다. */
		System.out.println("공격모드로 변환한다.");
	}

}

class Dropship extends Unit { // 수송선
//	int x, y; // 현재 위치

//	void move(int x, int y) {
//		/* 지정된 위치로 이동 */ }

//	void stop() {
//		/* 현재 위치에 정지 */ }
	
	@Override
	void move(int x, int y) {
		super.move(x, y);
		System.out.println(String.format("(%d, %d)로 떠서 이동", x, y));
	}

	void load() {
		/* 선택된 대상을 태운다. */
		System.out.println("선택된 대상을 태운다.");
	}

	void unload() {
		/* 선택된 대상을 내린다. */
		System.out.println("선택된 대상을 내린다.");
	}
}

public class Exam7_17 {
	
	public static void changeMod(Unit[] unit) { //탱크인 경우 공격모드로
		//공격모드 전환은 탱크 클래스에서만 있음. 
		//타입은 Unit타입. 
		for (int i = 0; i < unit.length; i++) {
			if (unit[i] instanceof Tank == true) { //Unit배열에서 Tank객체만 걸러낸다
				//unit[i].changeMod();  changeMod는 자식만 가진 메서드라서 unit 부모타입으로 변경이 필요
				//Tank tank = (Tank)unit[i];
				//Tank.changeMod();
				((Tank)unit[i]).changeMode(); //걸러낸 애들을 Tank로 캐스팅해줌. 
			}
		}
	} 
	
	
	public static void stimPack(Unit[] unit) { //보병인 경우 스팀팩으로
		for (int i = 0; i < unit.length; i++) {
			if (unit[i] instanceof Marine == true) {
				((Marine)unit[i]).stimPack();
			}
		}
	}

	
	
	public static void main(String[] args) {
		Unit[] units = new Unit[3];
		
		units[0] = new Marine();
		units[1] = new Tank();
		units[2] = new Dropship();
		
		for (int i = 0; i < units.length; i++) {
			units[i].move(10, 10);
		}
		
		changeMod(units);
		stimPack(units);
		
//		Unit unit = new Unit();
//		unit.move(0, 0);
//		unit.stop();
//		unit.stimPack();

	}

}

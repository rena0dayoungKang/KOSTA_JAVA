package chapter07;
// [Hint] instanceof연산자를 사용해서 형변환한다.
public class Exam7_18 {

	//(1) action메서드를 작성하시오.
	static void action(Robot robot) {
		if (robot instanceof DanceRobot) {
			((DanceRobot)robot).dance();
		} else if (robot instanceof SingRobot) {
			((SingRobot)robot).sing();
		} else if (robot instanceof DrawRobot) {
			((DrawRobot)robot).draw();
		}
	}
	
	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };
		for (int i = 0; i < arr.length; i++)
			action(arr[i]); //로봇 배열의 하나인 Robot타입이다.
	} // main

}

class Robot {
	
}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다.");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}

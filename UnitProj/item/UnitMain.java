package item;

public class UnitMain {

	public static void main(String[] args) {
		Tank tank = new Tank();
		Marine marine = new Marine();
		SCV scv = new SCV();
		
		scv.repair(tank);
		//scv.repair(marine); //error가 난다
		scv.repair(scv);
		
	}

}

package item;

public class SCV extends GroundUnit implements IRepairable{
	
	public SCV() {
		super(60);
		hitPoint = MAX_HP;
	}
	
	@Override
	public String toString() {
		return "SCV";
	}
	
	public void repair(IRepairable unit) {
		if (unit instanceof Unit) {
			Unit u = (Unit)unit;
			u.hitPoint = u.MAX_HP;
		}
	}

}

package chapter06;

public class SutdaCard {
	int num;
	boolean isKwang;
	
	public SutdaCard(int numarg, boolean isKwangarg) {
		this.num = numarg;
		this.isKwang = isKwangarg;
	}
	
	public SutdaCard() {
		this.num = 1;
		this.isKwang = true;
	}
	
	public String info() {
		return num + (isKwang? "K" : "");
	} 
	//isKwang이 true이면 K를 출력, false이면 ""공백출력

}

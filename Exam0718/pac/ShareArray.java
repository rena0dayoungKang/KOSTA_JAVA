//singleton private생성자를 만들때 대표적 예 
package pac;

public class ShareArray {
	int[] array = new int[100];
	int cnt;
	static ShareArray shareArray; //static메소드에서 접근하려고

	private ShareArray() {
	} // private생성자

	public static ShareArray getRefShareArray() {
		//밖에서(ShareArrayMain) 객체 생성 없이도 호출 하기 위해 static
		if (shareArray == null) {
			shareArray = new ShareArray();
		}
		return shareArray;
	}

	public void addData(int data) {
		array[cnt++] = data;
	}

	public int getData(int idx) {
		return array[idx];
	}

}
//싱글톤 디자인 패턴 
//private 생성자를 통해 외부에서 객체 생성 없이 
//static 메서드를 통해 외부에서 호출 하기 위함

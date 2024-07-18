//singleton private생성자를 만들때 대표적 예 
import pac.ShareArray;

public class ShareArrayMain {

	public static void main(String[] args) {
		// ShareArray sa = new ShareArray();
		// 생성자가 private라서 지금 오류가 난다.

		ShareArray sa1 = ShareArray.getRefShareArray();
		// private생성자 대신 static 메서드 사용
		sa1.addData(100);
		sa1.addData(200);
		sa1.addData(300);

		ShareArray sa2 = ShareArray.getRefShareArray();
		System.out.println(sa2.getData(0));
		System.out.println(sa2.getData(1));
		System.out.println(sa2.getData(2));
		//sa1과 sa2는 지금 레퍼런스(주소)가 같다 

	}

}

//try catch안에 try catch를 넣을 수 있다. 
public class ExceptionTest4 {

	public static void main(String[] args) {
		try {
			String string = null;
			System.out.println(string.toString());
		} catch (NullPointerException e) {
			try {
				throw e;
			} catch (Exception ee) {
				ee.printStackTrace();
			}
		}
	}

}

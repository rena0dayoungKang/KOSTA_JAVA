
public class ExceptionTest3 {

	public static void main(String[] args) {
		try {
			System.out.println(1);
			throw new Exception("내가 만든 예외");
			// System.out.println(2); //강제로 발생한 예외 밑에 코드는 실행하지 않음
		} catch (Exception e) {
			// System.out.println(e.getMessage());
			e.printStackTrace(); // 예외에 대한 전체 정보를 출력
		}
		System.out.println("종료");
	}

}

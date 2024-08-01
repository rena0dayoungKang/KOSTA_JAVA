import service.BaseBallService;

public class Baseball {

	public static void main(String[] args) {
		BaseBallService service = new BaseBallService();
		while(true) {
			service.start();
		}
	}

}

package chapter08;

class UnsupportedFuctionException extends Exception {
	private final int ERR_CODE;

	UnsupportedFuctionException(String msg, int code) {
		super(msg);
		this.ERR_CODE = code;
	}

	public int getErrorCode() {
		return ERR_CODE;
	}

	@Override
	public String getMessage() {
		return String.format("[%d]%s", ERR_CODE, super.getMessage());
	}
}

public class Exam8_9 {
	public static void main(String[] args) throws Exception {
		throw new UnsupportedFuctionException("지원하지 않는 기능입니다.", 100);
	}
}

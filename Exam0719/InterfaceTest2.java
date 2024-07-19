//
interface IClick {
	void click();
}

class Button {
	IClick iClick;

	void onClick() {
		System.out.println("꾹 들어갔다 나옴.");
		if (iClick != null) {
			iClick.click();
		}
	}

	public void addClickEventListner(IClick iClickarg) {
		this.iClick = iClickarg;
	}
}

//class LoginButton extends Button {
//	@Override
//	void onClick() {
//		super.onClick();
//		System.out.println("로그인 처리");
//	}
//	
//}

public class InterfaceTest2 {

	public static void main(String[] args) {
		// Button button = new Button();
		// LoginButton button = new LoginButton();
		// button.onClick();

		Button button = new Button();
		
		/////////////////////////////////////
//		IClick iClick = new IClick() {
//			
//			@Override
//			public void click() {
//				// TODO Auto-generated method stub
//				System.out.println("로그인 처리 ");
//			}
//		};
		////////////////////////////////////////
		
		//button.addClickEventListner(iClick);
		
		//1. 로그인 버튼으로 사용
		button.addClickEventListner(new IClick() {
			//인터페이스는 new가 안되지만, 익명클래스로서 사용됨
			@Override
			public void click() {
				System.out.println("로그인 처리");
			}
		});
		
		button.onClick();
		//파라미터가 인터페이스 인 경우가 안드로이드에서 많다. 
		
		//2. 회원가입 버튼으로도 사용 
		Button joinButton = new Button();
		joinButton.addClickEventListner(new IClick() {
			
			@Override
			public void click() {
				System.out.println("회원가입 처리");
				
			}
		});
		
		joinButton.onClick();
		//
	}

}

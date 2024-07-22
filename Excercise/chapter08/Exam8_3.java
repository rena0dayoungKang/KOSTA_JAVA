package chapter08;

class NumberException extends Exception {
}

class InvalidNumberException extends NumberException {
}

class NotANumberException extends NumberException {
}

class Parent {
	void add(int a, int b) throws InvalidNumberException, NotANumberException {
	}

	void func() throws Exception { // 부모타입의 Exception을 선언부에 넣어도 상관은없다.
		throw new InvalidNumberException();
	}
}

class Child extends Parent {

//O
//	@Override
//	void add(int a, int b) throws InvalidNumberException, NotANumberException {
//	}

//	@Override
//	void add(int a, int b) throws InvalidNumberException {
//	}

//	@Override
//	void add(int a, int b) throws NotANumberException {
//	}

//X
//	@Override
//	void add(int a, int b) throws NumberException {
//		//오버라이딩 할때는 선언부에는 선언부를 같이 맞추거나, 일부만 사용하고 
//		//부모타입의 throws는 올 수 없다. 
//	}
}

public class Exam8_3 {

	public static void main(String[] args) {
		
		//Exam8_4
		Parent parent = new Parent();
		//Parent.add(10, 20); //그냥하면 에러, try~catch로 묶어야한다
		
		//1.
		try {
			parent.add(10, 20);
		} catch (InvalidNumberException e) { //add메서드에 있는 익셉션 두가지 다 넣어준다
		} catch (NotANumberException e) { //add메서드에 있는 익셉션 두가지 다 넣어준다
			
		}
		
		//2.
		try {
			parent.add(10, 20);
		} catch (NotANumberException e) { //add메서드에 있는 익셉션 두가지 다 넣어준다
		} catch (InvalidNumberException e) { //add메서드에 있는 익셉션 두가지 다 넣어준다
		}
		
		//3. 
		try {
			parent.add(10, 20);
		} catch (NotANumberException e) { //
		} catch (NumberException e) { // 부모가 뒤에 와야 한다.
		}
		
		//4.
		try {
			parent.add(10, 20);
		} catch (NumberException e) { //
		} 
		
		//5.
		try {
			parent.add(10, 20);
		} catch (Exception e) { //
		}
		

		
	}

}

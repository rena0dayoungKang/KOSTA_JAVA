//Object의 equals클래스
class Complex { //3+5i (실수 + 허수)
	int real;		//실수부
	int imaginary;	//허수부
	
	Complex(int r, int i) {
		real = r;
		imaginary = i;
	}
	
	@Override
	public boolean equals(Object obj) {  //Object클래스에서 오버라이딩 된 equals메서드
		if (obj instanceof Complex == false) return false;
		Complex complex = (Complex)obj; 
		return real == complex.real && imaginary == complex.imaginary;
	}
	
	@Override
		public int hashCode() { //해쉬코드메서드 오버라이딩
			// TODO Auto-generated method stub
			return (real * real)+(imaginary * imaginary * imaginary);
		}
	
}
public class EqualsTest1 {

	public static void main(String[] args) {
		Complex c1 = new Complex(3, 5);
		Complex c2 = new Complex(3, 5);
		Complex c3 = new Complex(5, 3);
		Complex c4 = new Complex(3, 3);
		
		System.out.println(c1.equals(c2)); //true
		System.out.println(c1.equals(c3)); //false
		System.out.println(c1.equals(c4)); //false
		
		System.out.println(c1.hashCode()); //Object클래스의 hashCode호출, 주소값 리턴
		System.out.println(c2.hashCode()); //오버라이딩해서 적절히 함수를 변경해서 작성할 수 있다. 
		System.out.println(c3.hashCode());
		System.out.println(c4.hashCode());
	}

}

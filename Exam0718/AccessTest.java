public class AccessTest {

	public static void main(String[] args) {
		Test test = new Test();
		test.n=10;
		
		
		//test.age = 10;
		test.setAge(10);
		System.out.println(test.getAge());
	}

}

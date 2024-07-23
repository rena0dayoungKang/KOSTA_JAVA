
public class StringBuilderTest {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("abcdefg");
		System.out.println(sb);
		sb.deleteCharAt(1);
		System.out.println(sb);
		sb.delete(2, 3);
		System.out.println(sb);
	}

}

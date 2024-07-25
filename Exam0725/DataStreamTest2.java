import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataStreamTest2 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		DataInputStream dis = null;

		try {
			fis = new FileInputStream("info.bin");
			//inputStream은 파일이 없으면 에러가 나기 때문에 예외처리가 반드시 필요하다. 
			dis = new DataInputStream(fis);

			int age = dis.readInt();
			String name = dis.readUTF();
			double height = dis.readDouble();
			boolean isMarried = dis.readBoolean();

			System.out.println(age + "," + name + "," + height + "," + isMarried);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (dis != null)
					dis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

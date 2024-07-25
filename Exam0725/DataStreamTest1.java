import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest1 {

	public static void main(String[] args) {
		int age = 20;
		String name = "홍길동";
		double height = 176.2;
		boolean isMarried = false;
		
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		
		try {
			fos = new FileOutputStream("info.bin");
			//바이너리 형태로 저장하는 것이 파일용량을 줄일 수 있음. 속도 유리
			dos = new DataOutputStream(fos);
			dos.writeInt(age); 
			dos.writeUTF(name);
			dos.writeDouble(height);
			dos.writeBoolean(isMarried);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (dos != null) {dos.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

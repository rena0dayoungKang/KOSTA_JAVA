import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest1 {

	public static void main(String[] args) {
//		FileInputStream fis = null;
		FileReader fis = null;
		try {
//			fis = new FileInputStream("news.txt");
			fis = new FileReader("totnews.txt");
			int data;
			
			while((data = fis.read()) != -1) {
				System.out.print((char)data);
				//한글자는 한글로 2바이트인데, 1바이트씩 쪼개서 읽어오기 때문이다
				//fileReader로 만들어주면 해결됨.문자단위로 읽어오기 때문이다. 
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

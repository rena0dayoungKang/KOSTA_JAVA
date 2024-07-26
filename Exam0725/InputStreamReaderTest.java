import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
	public static void main(String[] args) {

		FileInputStream fis = null;
		InputStreamReader isr = null; // 중간 어댑터의 느낌
		//Stream형태가 바이트 출력이니까 어댑터를 통해서 버퍼리더로 텍스트형태로 출력
		
		BufferedReader br = null; //라인단위조작

		try {
			fis = new FileInputStream("news.txt");
			isr = new InputStreamReader(fis, "UTF-8");
			br = new BufferedReader(isr);

			String str = null;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}

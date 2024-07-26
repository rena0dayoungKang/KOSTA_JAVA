//BufferedReader 사용법 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderTest1 {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		

		try {
			fr = new FileReader("news.txt");
			br = new BufferedReader(fr);
			
			fw = new FileWriter("cpy.txt");
			bw = new BufferedWriter(fw);
						
			// BufferedReader의 장점 : 라인 단위로 읽는다.
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line); //콘솔에 라인별로 출력
				bw.write(line); //BufferedWriter로 파일로 저장 -> close안하면 저장안됨
				bw.newLine(); //다음 줄을 새 줄로 구분하는 데 사용 (엔터친다)
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
				if (bw != null) bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

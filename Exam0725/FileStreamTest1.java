import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamTest1 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream("news.txt");
			fos = new FileOutputStream("weather.txt");
			
			bis = new BufferedInputStream(fis); //보조스트림은 다이렉트로 파일에 꽂을수 없음 
			bos = new BufferedOutputStream(fos);

			byte[] buff = new byte[100]; // buff에 0으로 채워져있음 heap영역 100byte짜리버퍼
			int len; // 읽어온 갯수
//			while ((len = fis.read(buff)) > 0) {
//				// 파일이 950바이트라면, 100byte가 10번실행
//				// 100byte 1회전을 하면 다시 버퍼를 재사용 한다.
//				// 마지막 회전때는 50바이트만 쓰고 나머지 50바이트는 이전 회전의 값이 들어감
//				// fos.write(buff);
//				fos.write(buff, 0, len);
//				// 그래서 버퍼가 0부터 len길이만큼만 write해야 한다. 
//			}
			
			//결과는 동일하고 성능은 더 좋아진다.  
			while ((len = bis.read(buff)) > 0) {
				bos.write(buff, 0, len);
			}
			
			

			int data;
//			while((data=fis.read())!=-1) { //file안에 뭐가 데이터가 있다면
//				//읽어올 값이 없으면 -1이다. -1이 아니라면 뭔가 적혀있으니까 한 바이트씩 write한다. 
//				fos.write(data);
//			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bis != null) { bis.close(); }
				if (bos != null) { bos.close(); }
			} catch (IOException e) {
				e.printStackTrace();
			}
//			try {
//				if (fis != null)
//					fis.close(); // fis가 null이 아니라면은 fis가 열려있다는 뜻
//				if (fos != null)
//					fos.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
		}
	}

}

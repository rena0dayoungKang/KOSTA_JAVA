import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

//Properties 사용방법
public class PropertiesTest1 {
	public static void main(String[] args) throws IOException {
		Properties props = new Properties();   //부모가 Hashtable
		props.setProperty("driver", "org.mariadb.jdbc.Driver"); //MariaDB Driver
		props.setProperty("url", "jdbc:mariadb://localhost:3306/testdb");
		props.setProperty("username", "root");
		props.setProperty("password", "7564");
		
		props.store(new FileOutputStream("db.properties"), "Database Connection");
		//File과 관련된 애들은 tryCatch 하거나 throws
		//프로젝트 refresh하고 보면 프로젝트 내부에 db.properties파일 생김
		props.storeToXML(new FileOutputStream("db.xml"), "Database Connection");
		//XML포맷으로 db.xmls파일 생김
		props.storeToXML(new FileOutputStream("db2.properties"), "Database Connection");
		//이클립스가 알아서 자동으로 xml로 변환해주기 때문에 상관은 없음 
		
	}

}

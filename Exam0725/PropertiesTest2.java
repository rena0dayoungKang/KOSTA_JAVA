import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest2 {

	public static void main(String[] args) throws IOException {
		Properties props = new Properties();
		props.load(new FileInputStream("db.properties"));
		
		System.out.println(props.getProperty("driver"));
		System.out.println(props.getProperty("url"));
		System.out.println(props.getProperty("username"));
		System.out.println(props.getProperty("password"));
		
		
		System.out.println("================================");
		
		Properties props2 = new Properties();
		props2.loadFromXML(new FileInputStream("db.xml"));
		System.out.println(props2.getProperty("driver"));
		System.out.println(props2.getProperty("url"));
		System.out.println(props2.getProperty("username"));
		System.out.println(props2.getProperty("password"));
		
	}

}

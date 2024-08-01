import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//자바에서 DB 처리 과정 
//1. DB연결 : Connection 
//2. SQL문 실행을 위해 statement 얻기 : Statement, PreparedStatement 두가지방식 
//                                                   : conn.createStatement()
//3. SQL문 문자열로 작성
//4. 쿼리문 실행 : executeUpdate(insert, update, delete) , executeQuery(select) 
//													: stmt.executeUpdate(), stmt.executeQuery()


public class UserDB {
	//** DataBase 연결 
	//1) Driver 설정  -- db종류 (oracle, mariadb, ...)
	//2) url 설정
	//3) username 설정 -- db에서 내가 만든 계정 (root, test 등의 계정)
	//4) password 설정 -- db에서 내가 만든 계정의 비밀번호 
	
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;   // import java.sql.Statement;
		try {
			Class.forName("org.mariadb.jdbc.Driver");  //Driver 설정
			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/testdb24", "root", "7564");
			//클래스.메소드 : static메소드 getConnection메소드는 static인 것
			//클래스파일은 컴파일된 파일이기 때문에 안에 계정이나 비번이 바뀌면 다시 배포하고 이럴때 이런문제점이 생긴다. 
			//그래서 계정과 비번을 properties 다른 파일로 떨굴 수 있다. 
			System.out.println("접속 성공");

			stmt = conn.createStatement();
			String sqlString = "insert into user (id,name) values('song', '송길동')";
			int cnt = stmt.executeUpdate(sqlString);
			System.out.println(cnt +"개 데이터 삽입 성공");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) conn.close();
				//connection은 다 쓰고 나면 반납을 해주어야 한다. 
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} 
	}

}

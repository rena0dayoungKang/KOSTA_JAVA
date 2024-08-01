
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import dao.ArticleDAO;
import dto.Article;

//driver, url, username, password를 다른 파일로 관리하는 방법
//Connection close 하는 메서드를 따로 만든다.

public class ArticleDB {
//	public static Connection getConnection() {
//		Connection conn = null;
//		try {
//			Properties prop = new Properties();
//			prop.load(new FileInputStream("db.properties"));
//			// db.properties에 있는 드라이버, 계정, 비번을 물고 옴
//			Class.forName(prop.getProperty("driver"));
//			// org.mariadb.jdbc.Driver 를 물고 옴
//			conn = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("username"),
//					prop.getProperty("password"));
//		} catch (IOException e) {
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//
//		return conn;
//	}
//
//	public static void close(Connection conn) {
//		try {
//			if (conn != null)
//				conn.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//
//	public static void close(ResultSet rs) {
//		try {
//			if (rs != null)
//				rs.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//
//	public static void close(Statement stmt) {
//		try {
//			if (stmt != null)
//				stmt.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//
//	public static void insertArticle(Article article) {
//		Connection conn = getConnection();
//		// 1. 방식1
//		// Statement stmt = null;
//		// String sqlString = String.format("insert into article (title,content,writer)
//		// values ('%s', '%s', '%s')",
//		// article.getTitle(), article.getContent(), article.getWriter());
//
//		// 2. 방식
//		PreparedStatement pstmt = null;
//		String sqlString = "insert into article (title, content, writer) values (?,?,?)";
//
//		try {
//			// 1. 방식1
//			// createStatement 에는 인자 안넣고 execute에 넣어주는 방식
//			// stmt = conn.createStatement();
//			// int cnt = stmt.executeUpdate(sqlString);
//
//			// 2. 방식2
//			// createStatemnt 에 인자를 넣고 execute에 인자 없는 방식
//			// 방식2를 더 많이 사용
//			pstmt = conn.prepareStatement(sqlString);
//			pstmt.setString(1, article.getTitle());
//			pstmt.setString(2, article.getContent());
//			pstmt.setString(3, article.getWriter());
//			int cnt = pstmt.executeUpdate();
//
//			System.out.println(cnt + "개 데이터 삽입");
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally { // close할 때는 연 순서의 반대로
//			// close(stmt);
//			close(pstmt);
//			close(conn);
//		}
//
//	}
//
//	public static Article selectArticle(Integer num) {
//		Connection conn = getConnection();
//		PreparedStatement pstmt = null;
//		String sqlString = "select * from article where num=?";
//		Article article = null;
//		ResultSet rs = null;
//		try {
//			pstmt = conn.prepareStatement(sqlString);
//			pstmt.setInt(1, num); // sqlString 물음표의 위치
//			rs = pstmt.executeQuery(); // select문은 executeQuery, 쿼리 결과가 여러개가 있을 수 있음 ResultSet으로 받음
//			if (rs != null && rs.next()) {
//				// String title = rs.getString(2); //2번째 컬럼에 있는 title
//				String title = rs.getString("title");
//				String content = rs.getString("content");
//				String writer = rs.getString("writer");
//				article = new Article(num, title, content, writer);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			close(rs);
//			close(pstmt);
//			close(conn);
//		}
//
//		return article;
//	}
//
//	public static void updateArticle(Article article) {
//		Connection conn = getConnection();
//		PreparedStatement pstmt = null;
//		String sqlString = "update article set title=?, content=? where num=?";
//
//		try {
//			pstmt = conn.prepareStatement(sqlString);
//
//			pstmt.setString(1, article.getTitle());
//			pstmt.setString(2, article.getContent());
//			pstmt.setInt(3, article.getNum());
//			pstmt.executeUpdate();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			close(pstmt);
//			close(conn);
//		}
//	}
//
//	public static List<Article> selectAllArticle() {
//		List<Article> list = new ArrayList<>();
//
//		Connection conn = getConnection();
//		// PreparedStatement pstmt = null;
//		// String sqlString = "select * from article"; //쿼리문에 ? 가 없으므로 prepareStatement쓸
//		// 필요 없음
//		Statement stmt = null;
//		ResultSet rs = null;
//		String sqlString = "select * from article";
//
//		try {
//			stmt = conn.createStatement();
//			rs = stmt.executeQuery(sqlString);
//			if (rs != null) {
//				while (rs.next()) {
//					Integer num = rs.getInt("num");
//					String title = rs.getString("title");
//					String content = rs.getString("Content");
//					String writer = rs.getString("writer");
//					list.add(new Article(num, title, content, writer));
//				}
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			close(rs);
//			close(stmt);
//			close(conn);
//		}
//
//		return list;
//	}
//
//	public static void deleteArticle(Integer num) {
//		Connection conn = getConnection();
//		PreparedStatement pstmt = null;
//		String sqlString = "delete from article where num=?";
//
//		try {
//			pstmt = conn.prepareStatement(sqlString);
//			pstmt.setInt(1, num);
//			int cnt = pstmt.executeUpdate();
//			System.out.println(cnt + "개 데이터 삭제");
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			close(pstmt);
//			close(conn);
//		}
//	}

	public static void main(String[] args) {
		// 1. 글작성
//		ArticleDAO.insertArticle(new Article("글제목2", "글내용2", "song"));

		// 2. 글조회
//		Article article = ArticleDAO.selectArticle(1);
		// Article article = selectArticle(2);
		// System.out.println(article.getNum());
//		System.out.println(article);

		// 3. 글수정
//		article.setTitle("글제목 수정");
//		article.setContent("글내용 수정");
//		ArticleDAO.updateArticle(article);

		// 4. 전체 글 목록 조회
//		List<Article> list = ArticleDAO.selectAllArticle();
//		System.out.println(list);

		// 5. 글삭제
//		ArticleDAO.deleteArticle(1);
		
		// DB처리해주는 역할을 하는 클래스를 따로 만들고 DAO라고 한다. 지금은 main에 다 같이 있게 만든것. 
		// 따로 ArticleDAO로 나눌 수 있음 
		
		
		

	}

}

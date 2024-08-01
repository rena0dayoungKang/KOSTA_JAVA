package dao;

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

import acc.Account;
import acc.SpecialAccount;

public class BankDAO {
	public static Connection getConnection() { // db.properties 커넥션
		Connection conn = null;
		try {
			Properties prop = new Properties();
			prop.load(new FileInputStream("db.properties"));
			Class.forName(prop.getProperty("driver"));
			conn = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("username"),
					prop.getProperty("password"));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conn;
	}

	public static void close(Connection conn) {
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void close(Statement stmt) {
		try {
			if (stmt != null) {
				stmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void close(ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void insertAccount(Account acc) { // 계좌입력
		Connection conn = getConnection();
		PreparedStatement pstmt = null;

		String sqlString = "insert into account(id, name, balance, grade) " + "values(?,?,?,?)";

		try {
			pstmt = conn.prepareStatement(sqlString);
			pstmt.setString(1, acc.getAccountNum());
			pstmt.setString(2, acc.getName());
			pstmt.setInt(3, acc.getBalance());

			if (acc instanceof SpecialAccount) {
				pstmt.setString(4, ((SpecialAccount) acc).getGrade());
			} else {
				pstmt.setString(4, null);
			}

			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 데이터 삽입");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(conn);
		}

	}

	public static Account selectAccount(String accNum) { // 계좌번호찾기
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		String sqlString = "select * from account where id=?";
		Account acc = null;
		ResultSet rs = null;

		try {
			pstmt = conn.prepareStatement(sqlString);
			pstmt.setString(1, accNum);
			rs = pstmt.executeQuery();
			if (rs != null && rs.next()) {
				String name = rs.getString("name");
				Integer balance = rs.getInt("balance");
				String grade = rs.getString("grade");
				if (grade == null) {
					acc = new Account(accNum, name, balance);
				} else {
					acc = new SpecialAccount(accNum, name, balance, grade);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
			close(conn);
		}
		return acc;

	}

	public static void updateBalance(Account acc) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		String sqlString = "update account set balance=? where id=?";

		try {
			pstmt = conn.prepareStatement(sqlString);
			pstmt.setInt(1, acc.getBalance());
			pstmt.setString(2, acc.getAccountNum());
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(conn);
		}
	}

	public static List<Account> selectAllAcount() {
		List<Account> list = new ArrayList<>();
		Connection conn = getConnection();

		Statement stmt = null;
		ResultSet rs = null;
		String sqlString = "select * from account";

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sqlString);
			if (rs != null) {
				while (rs.next()) {
					String id = rs.getString("id");
					String name = rs.getString("name");
					Integer balance = rs.getInt("balance");
					String grade = rs.getString("grade");
					if (grade == null) {
						list.add(new Account(id, name, balance));
					} else {
						list.add(new SpecialAccount(id, name, balance, grade));
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(stmt);
			close(conn);
		}

		return list;
	}

}

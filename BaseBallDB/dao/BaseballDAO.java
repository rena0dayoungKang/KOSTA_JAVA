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

import dto.Player;
import dto.Team;

public class BaseballDAO {

	public static Connection getConnection() {
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
		}  catch (SQLException e) {
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
	
	public static void close(ResultSet rSet) {
		try {
			if (rSet != null) {
				rSet.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}	
	
	
	public static void insertTeam(Team team) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		
		String sql = "insert into team(name, loc) values (?,?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, team.getName());
			pstmt.setString(2, team.getLoc());
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 팀 데이터 삽입");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(conn);
		}
		
		
	}

	public static Team selectTeam(String tname) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		
		String sql = "select * from team where name=?";
		Team team = null;
		ResultSet rSet = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, tname);
			rSet = pstmt.executeQuery();
			if (rSet != null && rSet.next()) {
				Integer num = rSet.getInt("num");
				String name = rSet.getString("name");
				String loc = rSet.getString("loc");
				team = new Team(num, name, loc);
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rSet);
			close(pstmt);
			close(conn);
		}
		return team;
	}

	public static List<Team> selectAllTeam() {
		List<Team> list = new ArrayList<>();
		Connection conn = getConnection();
		
		Statement stmt = null;
		ResultSet rSet = null;
		String sql = "select * from team";
		
		try {
			stmt = conn.createStatement();
			rSet = stmt.executeQuery(sql);
			if (rSet!=null) {
				while(rSet.next()) {
					Integer num = rSet.getInt("num");
					String name = rSet.getString("name");
					String loc = rSet.getString("loc");
					list.add(new Team(num, name, loc));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rSet);
			close(stmt);
			close(conn);
		}
		
		return list;
	}

	
	public static void insertPlayer(Player player) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		
		String sql = "insert into player(name, backNum, teamNum) values(?,?,?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, player.getName());
			pstmt.setInt(2, player.getBackNum());
			pstmt.setInt(3, player.getTeamNum());
			
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 선수 등록");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(conn);
		}
		
	}

	public static List<Player> selectPlayer(String name) {
		List<Player> playerList = new ArrayList<>();
		Connection conn = getConnection();

		PreparedStatement pstmt = null;
		ResultSet rSet = null;
		String sql = "SELECT p.num, p.name, p.backNum, p.teamNum, t.NAME \r\n"
				+ "FROM player p JOIN team t\r\n"
				+ "on p.teamNum = t.num\r\n"
				+ "WHERE p.NAME = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rSet = pstmt.executeQuery();
			if (rSet != null) {
				while(rSet.next()) {
					Integer pnum = rSet.getInt(1);
					String pname = rSet.getString(2);
					Integer backNum = rSet.getInt(3);
					Integer teamNum = rSet.getInt(4);
					String teamName = rSet.getString(5);
					playerList.add(new Player(pnum, pname, backNum, teamNum, teamName));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rSet);
			close(pstmt);
			close(conn);
		}
		return playerList;
	}



	public static List<Player> selectAllPlayer() {
		List<Player> playerList = new ArrayList<>();
		Connection conn = getConnection();
		
		Statement stmt = null;
		ResultSet rSet = null;
		String sql = "SELECT p.num, p.name, p.backNum, p.teamNum, t.NAME \r\n"
				+ "FROM player p JOIN team t\r\n"
				+ "on p.teamNum = t.num\r\n";
		
		try {
			stmt = conn.createStatement();
			rSet = stmt.executeQuery(sql);
			if (rSet != null) {
				while(rSet.next()) {
					Integer pnum = rSet.getInt(1);
					String pname = rSet.getString(2);
					Integer backNum = rSet.getInt(3);
					Integer teamNum = rSet.getInt(4);
					String teamName = rSet.getString(5);
					playerList.add(new Player(pnum, pname, backNum, teamNum, teamName));					
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rSet);
			close(stmt);
			close(conn);
		}
		
		
		return playerList;
	}
	
	
	
	
	
}

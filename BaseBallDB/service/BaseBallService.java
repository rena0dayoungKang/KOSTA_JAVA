package service;

import java.util.List;
import java.util.Scanner;

import dao.BaseballDAO;
import dto.Player;
import dto.Team;

public class BaseBallService {
	Scanner scanner = new Scanner(System.in);
	
	public void start() {
		System.out.println("[야구 관리 프로그램]");
		System.out.println("1. 팀");
		System.out.println("2. 선수");
		System.out.println("0. 종료");
		System.out.print("선택>>");
		int sel = Integer.parseInt(scanner.nextLine());
		switch (sel) {
		case 1: teamMenu(); break;
		case 2: playerMenu(); break;
		case 0: System.exit(0);
		} 
	}
	
	public void teamMenu() {
		System.out.println("[팀 메뉴]");
		System.out.println("1. 팀 목록 조회");
		System.out.println("2. 팀 조회");
		System.out.println("3. 팀 등록");
		System.out.print("선택>>");
		int sel = Integer.parseInt(scanner.nextLine());
		switch (sel) {
		case 1: getTeamList(); break;
		case 2: getTeam(); break;
		case 3: addTeam(); 
		}
	}
	
	public void getTeamList() {
		System.out.println("[팀 목록 조회]");
		// todo
		List<Team> list = BaseballDAO.selectAllTeam();
		for (Team team : list) {
			System.out.println(team);
		} 
	}
	
	public void getTeam() {
		System.out.println("[팀 조회]");
		System.out.print("팀명:");
		String name = scanner.nextLine();
		//todo
		Team team = BaseballDAO.selectTeam(name);
		System.out.println(team);
	}
	
	public void addTeam() {
		System.out.println("[팀 등록]");
		System.out.print("팀명:");
		String name = scanner.nextLine();
		System.out.print("연고지:");
		String loc = scanner.nextLine();
		
		Team team = new Team(name, loc);
		BaseballDAO.insertTeam(team);
	}
	
	public void playerMenu() {
		System.out.println("[선수 메뉴]");
		System.out.println("1. 선수목록조회");
		System.out.println("2. 선수 조회");
		System.out.println("3. 선수등록");
		System.out.print("선택>>");
		int sel = Integer.parseInt(scanner.nextLine());
		switch (sel) {
		case 1: getPlayerList(); break;
		case 2: getPlayer(); break;
		case 3: addPlayer(); break;
		}
	}
	
	public void getPlayerList() {
		System.out.println("[선수목록조회]");
		//todo
		List<Player> list = BaseballDAO.selectAllPlayer();
		for(Player player : list) {
			System.out.println(player);
		} 
	}
	
	public void getPlayer() {
		System.out.println("[선수조회]");
		System.out.println("이름: ");
		String name = scanner.nextLine();
		//todo
		List<Player> list = BaseballDAO.selectPlayer(name);
		for (Player player : list) {
			System.out.println(player);
		} 
		
	}
	
	public void addPlayer() {
		System.out.println("[선수등록]");
		System.out.print("이름:");
		String name = scanner.nextLine();
		System.out.print("등번호:");
		Integer backNum = Integer.parseInt(scanner.nextLine());
		System.out.print("팀명:");
		String teamName = scanner.nextLine();
		//todo
		Team team = BaseballDAO.selectTeam(teamName);
		if (team == null) {
			System.out.println("없는 팀입니다.");
		} else {
			Player player = new Player(name, backNum, team.getNum());
			BaseballDAO.insertPlayer(player);			
		}
		
	}
	
}

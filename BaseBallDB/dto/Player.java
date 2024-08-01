package dto;

public class Player {
	private Integer num;
	private String name;
	private Integer backNum;
	private Integer teamNum;
	private String teamName;

	public Player(Integer num, String name, Integer backNum, Integer teamNum, String teamName) {
		super();
		this.num = num;
		this.name = name;
		this.backNum = backNum;
		this.teamNum = teamNum;
		this.teamName = teamName;
	}

	public Player(String name, Integer backNum, Integer teamNum, String teamName) {
		super();
		this.name = name;
		this.backNum = backNum;
		this.teamNum = teamNum;
		this.teamName = teamName;
	}
	
	
	
	
	/**
	 * @param name
	 * @param backNum
	 * @param teamNum
	 */
	public Player(String name, Integer backNum, Integer teamNum) {
		super();
		this.name = name;
		this.backNum = backNum;
		this.teamNum = teamNum;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getBackNum() {
		return backNum;
	}

	public void setBackNum(Integer backNum) {
		this.backNum = backNum;
	}

	public Integer getTeamNum() {
		return teamNum;
	}

	public void setTeamNum(Integer teamNum) {
		this.teamNum = teamNum;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	@Override
	public String toString() {
		return String.format("번호: %d, 이름 : %s, 등번호:%s, 소속팀번호 : %d, 소속팀명 : %s", 
				getNum(), getName(), getBackNum(), getTeamNum(), getTeamName());
	}

}

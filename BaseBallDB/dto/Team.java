package dto;

public class Team {
	
	private Integer num;
	private String name;
	private String loc;
	
	/**
	 * @param num
	 * @param name
	 * @param loc
	 */
	public Team(Integer num, String name, String loc) {
		super();
		this.num = num;
		this.name = name;
		this.loc = loc;
	}

	/**
	 * @param name
	 * @param loc
	 */
	public Team(String name, String loc) {
		super();
		this.name = name;
		this.loc = loc;
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

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	
	@Override
	public String toString() {
		return String.format("팀번호 : %d, 팀명 : %s, 연고지 : %s", getNum(), getName(), getLoc());
	}
	

}

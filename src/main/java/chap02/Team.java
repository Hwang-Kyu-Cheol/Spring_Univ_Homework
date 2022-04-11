package chap02;

public class Team {

	private Owner owner;
	private Director director;
	private Coach coach;
	private Player player1;
	private Player player2;
	private Player player3;
	
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public Team() {
		System.out.println("팀 객체가 생성되었습니다.");
	}
	
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	
	public void setDirector(Director director) {
		this.director = director;
	}
	
	public void setCoach(Coach coach) {
		this.coach = coach;
	}
	
	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}
	
	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}
	
	public void setPlayer3(Player player3) {
		this.player3 = player3;
	}
	
	public void info() {
		System.out.println(name);
		System.out.println(owner.getName());
		System.out.println(director.getName());
		System.out.println(coach.getName());
		System.out.println(player1.getName());
		System.out.println(player2.getName());
		System.out.println(player3.getName());
	}
}
